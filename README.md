🤖 HackerRank Test Automation Suite

A Selenium-based test automation framework for validating HackerRank coding challenges.
This tool automates challenge navigation, code submission, and result verification to ensure efficient and reliable testing.

🎯 Overview

The goal of this project is to provide a fast and automated way to test HackerRank solutions, eliminating repetitive manual validation.

🚀 Features

📂 Challenge Navigation – Automatically browse HackerRank challenges.

⌨️ Code Submission – Submit solutions programmatically.

✅ Result Validation – Verify outputs against sample test cases.

⚙️ Prerequisites

Python (latest version recommended)

Selenium & dependencies (installed via requirements.txt)

A valid HackerRank account

🛠️ Installation & Setup
# Clone the repository
git clone https://github.com/idamanukyan/HackerRank_com_test.git

# Navigate into the project directory
cd HackerRank_com_test

# Install dependencies
pip install -r requirements.txt

▶️ Usage

Update your HackerRank credentials in config.json:

{
  "username": "your_hackerrank_username",
  "password": "your_hackerrank_password",
  "browser": "chrome"
}


Run the test suite:

python test_hackerrank.py

⚙️ Configuration

username → your HackerRank username

password → your HackerRank password

browser → "chrome" or "firefox" (based on your local setup)

🤝 Contributions

Contributions are welcome! 🎉
Feel free to open an issue or submit a pull request to improve functionality.

📜 License

This project is licensed under the MIT License – see LICENSE.md
 for details.
