document.addEventListener("DOMContentLoaded", function () {
  document.getElementById("ajaxButton").addEventListener("click", function () {
    var paramValue = document.getElementById("paramInput").value;
    fetch("/ajax?param=" + encodeURIComponent(paramValue))
      .then((response) => {
        if (!response.ok) {
          throw new Error("Network response was not ok " + response.statusText);
        }
        return response.text();
      })
      .then((data) => {
        document.getElementById("result").textContent = data;
      })
      .catch((error) => {
        document.getElementById("result").textContent = "Error: " + error.message;
      });
  });
});
