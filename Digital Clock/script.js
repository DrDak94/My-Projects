function updateClock() {
  const now = new Date();

  let hours = now.getHours();
  let minutes = now.getMinutes();
  let seconds = now.getSeconds();

  hours = String(hours).padStart(2, "0");
  minutes = String(minutes).padStart(2, "0");
  seconds = String(seconds).padStart(2, "0");

  const timeString = `${hours}:${minutes}:${seconds}`;
  document.getElementById("clock").textContent = timeString;

  // ✅ Move this inside the function
  const dateString = now.toLocaleDateString(undefined, {
    weekday: "long",
    year: "numeric",
    month: "long",
    day: "numeric",
  });
  document.getElementById("date").textContent = dateString;
}

setInterval(updateClock, 1000);
updateClock();

// 🌙 Theme toggle
const toggleCheckbox = document.getElementById("theme-toggle");
const body = document.body;

// Load theme from localStorage
const savedTheme = localStorage.getItem("theme") || "dark";
body.classList.add(savedTheme);

// Set checkbox position
toggleCheckbox.checked = savedTheme === "light";

toggleCheckbox.addEventListener("change", () => {
  const newTheme = toggleCheckbox.checked ? "light" : "dark";
  body.classList.remove("light", "dark");
  body.classList.add(newTheme);
  localStorage.setItem("theme", newTheme);
});
