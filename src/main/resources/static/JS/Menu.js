javascript
function toggleMenu() {

    const menu = document.getElementById("navMenu");
    const button = document.getElementById("toggleBtn");
    const overlay = document.getElementById("overlay");

    // Safety check
    if (!menu || !button || !overlay) {
        console.error("Menu elements not found");
        return;
    }

    const isActive = menu.classList.contains("active");

    if (isActive) {

        // CLOSE MENU
        menu.classList.remove("active");
        menu.setAttribute("aria-hidden", "true");

        overlay.classList.remove("active");

        button.innerHTML = '<i class="fa-solid fa-bars"></i>';
        button.setAttribute("aria-label", "Open Menu");

    } else {

        // OPEN MENU
        menu.classList.add("active");
        menu.setAttribute("aria-hidden", "false");

        overlay.classList.add("active");

        button.innerHTML = '<i class="fa-solid fa-xmark"></i>';
        button.setAttribute("aria-label", "Close Menu");
    }
}


function closeMenu() {

    const menu = document.getElementById("navMenu");
    const button = document.getElementById("toggleBtn");
    const overlay = document.getElementById("overlay");

    if (!menu || !button || !overlay) {
        return;
    }

    // CLOSE MENU
    menu.classList.remove("active");
    menu.setAttribute("aria-hidden", "true");

    overlay.classList.remove("active");

    button.innerHTML = '<i class="fa-solid fa-bars"></i>';
    button.setAttribute("aria-label", "Open Menu");
}


// ESCAPE KEY
document.addEventListener("keydown", function(event) {

    if (event.key === "Escape") {
        closeMenu();
    }

});


// INITIAL STATE
document.addEventListener("DOMContentLoaded", function() {

    const menu = document.getElementById("navMenu");

    if (menu) {
        menu.setAttribute("aria-hidden", "true");
    }

});
