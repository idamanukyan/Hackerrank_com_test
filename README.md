HackerRank_com_test
Overview:
This project is a Selenium-based test automation suite for HackerRank challenges. The primary goal is to automate the testing process, providing a reliable and efficient way to validate your HackerRank solutions.

Features:
Challenge Navigation: Automatically navigate through HackerRank challenges.
Code Submission: Submit code solutions programmatically.
Result Validation: Verify the correctness of the code output and test against sample inputs/outputs.
Prerequisites:
Ensure you have the latest version of Python installed.
Install the required Python packages using pip install -r requirements.txt.
Usage:
Clone the repository: git clone https://github.com/idamanukyan/HackerRank_com_test.git
Navigate to the project directory: cd HackerRank_com_test
Update the config.json file with your HackerRank credentials.
Run the tests using: python test_hackerrank.py
Configuration:
Adjust the config.json file with your HackerRank username, password, and other settings.

json
Copy code
{
  "username": "your_hackerrank_username",
  "password": "your_hackerrank_password",
  "browser": "chrome"
}
Contributions:
Contributions are welcome! Feel free to open issues or pull requests.

License:
This project is licensed under the MIT License - see the LICENSE.md file for details.
