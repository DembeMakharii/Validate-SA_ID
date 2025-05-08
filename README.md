# 🇿🇦 South African ID Number Validator

![Java](https://img.shields.io/badge/Java-17+-blue?logo=java&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit-5-green?logo=junit5)
![Build](https://img.shields.io/badge/Build-Passing-success)
![License](https://img.shields.io/badge/License-MIT-yellow)
![Tests](https://img.shields.io/badge/Tests-Passing-brightgreen)

A robust Java utility for validating South African ID numbers according to official specifications, with comprehensive validation checks and gender determination.

## 📋 Table of Contents
- [Features](#-features)
- [Validation Checks](#-validation-checks)
- [Installation](#-installation)
- [ID Number Structure](#-id-number-structure)
- [License](#-license)

## ✨ Features

| Feature | Description |
|---------|-------------|
| ✅ Complete Validation | Full validation against official SA ID standards |
| 📅 Date Validation | Birth date extraction and verification (YYMMDD) |
| ♀️♂️ Gender Detection | Determines gender from ID number digits |
| 🛂 Citizenship Check | Verifies citizenship status (SA citizen or permanent resident) |
| 🔢 Checksum Validation | Luhn algorithm validation for the checksum digit |
| 🧪 Test Coverage | Comprehensive unit tests with JUnit 5 |

## 🔍 Validation Checks

The validator performs these checks on South African ID numbers:

1. **Length Validation** (must be exactly 13 digits)
2. **Digit-Only Validation** (no letters or special characters)
3. **Birth Date Validation** (YYMMDD format)
   - Valid month (01-12)
   - Valid day for each month
4. **Gender Digit Validation** (digits 7-10)
5. **Citizenship Digit Validation** (digit 11: 0 or 1)
6. **Luhn Checksum Validation** (digit 13)

## 🛠️ Installation

1. **Prerequisites**: Java 17+ JDK installed
2. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/sa-id-validator.git
   cd sa-id-validator
   ```
## 📜 License
Distributed under the MIT License. See LICENSE for more information.

## 📧 Contact
Project Link: https://github.com/DembeMakharii/Validate-SA_ID
