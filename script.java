document.addEventListener("DOMContentLoaded", () => {
    // Formulir kontak
    document.getElementById("contact-form").addEventListener("submit", async (event) => {
        event.preventDefault();
        
        const name = document.getElementById("name").value;
        const email = document.getElementById("email").value;
        const message = document.getElementById("message").value;

        const response = await fetch('submit_form.php', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            },
            body: new URLSearchParams({
                name: name,
                email: email,
                message: message,
            })
        });

        const result = await response.text();
        document.getElementById("form-response").innerText = result;
    });

    // Load User Info
    document.getElementById("load-user-info").addEventListener("click", async () => {
        const response = await fetch('get_user_info.php');
        const data = await response.json();
        
        document.getElementById("user-info").innerHTML = `
            <p>Nama: ${data.name}</p>
            <p>Email: ${data.email}</p>
        `;
    });
});
