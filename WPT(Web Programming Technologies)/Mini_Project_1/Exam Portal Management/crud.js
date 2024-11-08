// Initialize timer variables
let timeLeft = 240; // 4 minutes in seconds
let timer;
//stores 240 as total time initialized in seconds
// timer- hold the interval time when it starts



// Load and save student data to/from Local Storage
function loadStudentData() {
    const data = localStorage.getItem('students');
    //.localstoragegetitems() for display
    // . setitem for storing
    return data ? JSON.parse(data) : [];
}

function saveStudentData(data) {
    localStorage.setItem('students', JSON.stringify(data));
}

// CREATE: Register a new student
function createStudent(student) {
    const students = loadStudentData();
    students.push(student);
    saveStudentData(students);
    alert('Student registration successful!');
}
//This function adds a new student to the list.



// READ: Display all students
function displayStudents() {
    const students = loadStudentData();
    const displayArea = document.getElementById('studentList');
    displayArea.innerHTML = '';

    students.forEach((student, index) => {
        const studentItem = document.createElement('li');
        studentItem.className = 'list-group-item';
        studentItem.innerHTML = `
            <strong>Name:</strong> ${student.name} - <strong>Email:</strong> ${student.email} - <strong>Exam:</strong> ${student.exam}
            <button class="btn btn-sm btn-danger float-right" onclick="deleteStudent(${index})">Delete</button>
            <button class="btn btn-sm btn-info float-right mr-2" onclick="loadStudentForEdit(${index})">Edit</button>
        `;
        displayArea.appendChild(studentItem);
    });
}

// UPDATE: Edit an existing student's information
function loadStudentForEdit(index) {
    const students = loadStudentData();
    const student = students[index];

    document.getElementById('studentName').value = student.name;
    document.getElementById('studentEmail').value = student.email;
    document.getElementById('exam').value = student.exam;
    document.getElementById('studentIndex').value = index;
}

function updateStudent(index, updatedStudent) {
    const students = loadStudentData();
    students[index] = updatedStudent;
    saveStudentData(students);
    alert('Student information updated successfully!');
    displayStudents();
}

// DELETE: Remove a student from the list
function deleteStudent(index) {
    const students = loadStudentData();
    students.splice(index, 1);
    saveStudentData(students);
    alert('Student registration deleted.');
    displayStudents();
}

// Timer Management Functions
function startTimer() {
    timer = setInterval(() => {
        const minutes = Math.floor(timeLeft / 60);
        const seconds = timeLeft % 60;
        document.getElementById("time").textContent = `${minutes}:${seconds < 10 ? '0' : ''}${seconds}`;
        
        if (timeLeft <= 0) {
            clearInterval(timer);
            alert("Time is up!");
        }
        
        timeLeft--;
    }, 1000);
}

function stopTimer() {
    clearInterval(timer);
}

// Start the timer if on exam page
if (document.getElementById("time")) {
    startTimer();
}

// Handle exam form submission
if (document.getElementById('examForm')) {
    document.getElementById('examForm').addEventListener('submit', function(e) {
        e.preventDefault();

        const answer1 = document.getElementById('answer1').value;

        // Validation for exam answer
        if (!answer1) {
            alert('Please answer the question before submitting!');
            return; // Stop if the answer is empty
        }

        stopTimer();

        const examResult = { question: "What is the capital of France?", answer: answer1 };
        localStorage.setItem('examResult', JSON.stringify(examResult));

        alert('Exam submitted successfully!');
    });
}

// Handle student registration form submission
if (document.getElementById('registrationForm')) {
    document.getElementById('registrationForm').addEventListener('submit', function(e) {
        e.preventDefault();
        const name = document.getElementById('studentName').value;
        const email = document.getElementById('studentEmail').value;
        const exam = document.getElementById('exam').value;
        const studentIndex = document.getElementById('studentIndex').value;

        // Validation for student registration
        if (!name || !email || !exam) {
            alert('All fields are required!');
            return; // Stop if any field is empty
        }

        // Simple email format check
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailPattern.test(email)) {
            alert('Please enter a valid email address!');
            return; // Stop if the email format is invalid
        }

        const student = { name, email, exam };

        if (studentIndex === '') {
            createStudent(student);
        } else {
            updateStudent(studentIndex, student);
        }

        clearForm();
        displayStudents();
    });
}

// Helper function to clear form fields
function clearForm() {
    document.getElementById('studentName').value = '';
    document.getElementById('studentEmail').value = '';
    document.getElementById('exam').value = '';
    document.getElementById('studentIndex').value = '';
}
