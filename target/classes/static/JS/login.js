document
    .getElementById("loginForm")
    .addEventListener("submit", function (event) {

        event.preventDefault();


        // Get values

        const email =
            document.getElementById("email").value.trim();

        const password =
            document.getElementById("password").value;


        const message =
            document.getElementById("message");


        // Clear previous message

        message.innerHTML = "";


        // Create JSON object

        const loginData = {

            email: email,

            password: password

        };


        console.log("Login Request:", loginData);


        // Call Spring Boot REST API

        fetch("http://localhost:8080/user/login", {

            method: "POST",

            headers: {

                "Content-Type": "application/json"

            },

            body: JSON.stringify(loginData)

        })


        .then(response => {

            if (!response.ok) {

                throw new Error(
                    "Invalid email or password"
                );

            }

            return response.json();

        })


        .then(data => {

            console.log(
                "Login Response:",
                data
            );


            message.style.color = "#00ff88";

            message.innerHTML =
                "Login successful!";


            // Store user information

            localStorage.setItem(
                "user",
                JSON.stringify(data)
            );


            // Redirect

            setTimeout(function () {

                window.location.href =
                    "home.html";

            }, 1000);

        })


        .catch(error => {

            console.error(
                "Login Error:",
                error
            );


            message.style.color = "#ff4444";

            message.innerHTML =
                "Invalid email or password.";

        });

    });