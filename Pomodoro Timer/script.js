let workMinutes = 25;
let breakMinutes = 5;
let seconds = 0;
let isRunning = false;
let isWorkSession = true;
let timer;

const timerDisplay = document.getElementById("timer");
const startBtn = document.getElementById("start");
const pauseBtn = document.getElementById("pause");
const resetBtn = document.getElementById("reset");
const statusText = document.getElementById("status");

function updateDisplay() {
  const minutes = isWorkSession ? workMinutes : breakMinutes;
  timerDisplay.textContent = `${String(minutes).padStart(2, "0")}:${String(
    seconds
  ).padStart(2, "0")}`;
}

function startTimer() {
  if (isRunning) return;
  isRunning = true;

  timer = setInterval(() => {
    if (seconds === 0) {
      if ((isWorkSession ? workMinutes : breakMinutes) === 0) {
        isWorkSession = !isWorkSession;
        statusText.textContent = isWorkSession ? "Session" : "Break";
        workMinutes = 25;
        breakMinutes = 5;
        seconds = 0;
        updateDisplay();
        return;
      }

      if (isWorkSession) {
        workMinutes--;
      } else {
        breakMinutes--;
      }
      seconds = 59;
    } else {
      seconds--;
    }

    updateDisplay();
  }, 1000);
}

function pauseTimer() {
  clearInterval(timer);
  isRunning = false;
}

function resetTimer() {
  pauseTimer();
  isWorkSession = true;
  workMinutes = 25;
  breakMinutes = 5;
  seconds = 0;
  statusText.textContent = "Session";
  updateDisplay();
}

startBtn.addEventListener("click", startTimer);
pauseBtn.addEventListener("click", pauseTimer);
resetBtn.addEventListener("click", resetTimer);

updateDisplay();
