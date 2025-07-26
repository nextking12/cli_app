# Script Manager 📝

A modern, user-friendly web application for managing and organizing your code scripts. Built with Spring Boot and featuring a sleek dark-themed web interface, this application lets you store, search, edit, and organize all your code snippets in one place.

![Script Manager Interface](https://img.shields.io/badge/Interface-Web%20Based-blue?style=flat-square)
![Java](https://img.shields.io/badge/Java-24-orange?style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.4-green?style=flat-square)
![Database](https://img.shields.io/badge/Database-H2%20In--Memory-lightblue?style=flat-square)

## ✨ Features

- **📱 Modern Web Interface**: Clean, responsive dark-themed UI that works on desktop and mobile
- **🔍 Smart Search**: Find scripts by name instantly
- **✏️ Easy Editing**: Click any script to view and edit it in a modal window
- **💾 Auto-Save**: All changes are automatically saved to the database
- **🗃️ Organized Storage**: Store unlimited scripts with names and content
- **⚡ Fast Performance**: In-memory H2 database for lightning-fast operations
- **🛡️ Safe Operations**: Confirmation dialogs for destructive actions

## 📋 Prerequisites

Before running this application, make sure you have the following installed on your computer:

### Required Software
1. **Java Development Kit (JDK) 24 or later**
   - Download from: [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
   - To check if Java is installed: Open terminal/command prompt and run `java -version`

### That's it! 🎉
The application uses Gradle Wrapper, so you don't need to install Gradle separately.

## 🚀 Quick Start Guide

### Step 1: Download the Application
```bash
# If you have git installed:
git clone [your-repository-url]
cd CliApp

# Or download and extract the ZIP file, then navigate to the folder
```

### Step 2: Run the Application

#### On Windows:
1. Open Command Prompt or PowerShell
2. Navigate to the project folder
3. Run:
```cmd
.\gradlew.bat bootRun
```

#### On Mac/Linux:
1. Open Terminal
2. Navigate to the project folder
3. Run:
```bash
./gradlew bootRun
```


### Step 3: Access the Application
1. Wait for the application to start (you'll see "Started CliAppApplication" in the console)
2. Open your web browser
3. Go to: **http://localhost:8080**
4. Start managing your scripts! 🎯

## 🎯 How to Use

### Adding a New Script
1. In the "Add New Script" section, enter a name for your script
2. Paste or type your code in the content area
3. Click "Add Script"
4. Your script is now saved and will appear in the list below

### Viewing and Editing Scripts
1. Click on any script name in the "Your Scripts" list
2. A modal window will open showing the script details
3. Edit the name or content as needed
4. Click "Update Script" to save changes

### Searching for Scripts
1. Use the search box in the "Search Scripts" section
2. Enter the script name you're looking for
3. Click "Search" or press Enter
4. Click "Clear" to show all scripts again

### Deleting Scripts
1. Click on a script to open the edit modal
2. Click the red "Delete Script" button
3. Confirm the deletion in the popup dialog
4. The script will be permanently removed

## 🛠️ Technical Details

### Architecture
- **Backend**: Spring Boot 3.5.4 with Java 24
- **Database**: H2 in-memory database (data resets when app stops)
- **Frontend**: HTML5, CSS3, JavaScript (Vanilla)
- **Styling**: Tailwind CSS with custom dark theme
- **API**: RESTful endpoints for all operations

### Project Structure

CliApp/
├── src/main/java/com/example/CliApp/
│   ├── CliAppApplication.java          # Main application class
│   ├── controller/ScriptController.java # REST API endpoints
│   ├── model/Script.java               # Data model
│   ├── repository/ScriptRepository.java # Database operations
│   └── service/ScriptService.java      # Business logic
├── src/main/resources/
│   ├── application.properties          # App configuration
│   └── static/index.html              # Web interface
└── build.gradle                       # Project dependencies


### API Endpoints
The application provides these REST API endpoints:

- `GET /api/scripts` - Get all scripts
- `GET /api/scripts/{id}` - Get script by ID
- `GET /api/scripts/byName/{name}` - Get script by name
- `POST /api/scripts` - Create new script
- `PUT /api/scripts/{id}` - Update existing script
- `DELETE /api/scripts/{id}` - Delete script by ID
- `DELETE /api/scripts/byName/{name}` - Delete script by name

## 🔧 Configuration

### Database Access
You can access the H2 database console for debugging:
1. Go to: http://localhost:8080/h2-console
2. Use these connection details:
   - **JDBC URL**: `jdbc:h2:mem:mydb`
   - **Username**: `sa`
   - **Password**: `password`

### Customization
- **Port**: Change the server port by adding `server.port=8081` to `application.properties`
- **Database**: Switch to persistent database by modifying `application.properties`
- **Styling**: Modify the CSS in `index.html` to change the appearance

## 🐛 Troubleshooting

### Common Issues

**❌ "Java not found" error**
- Make sure Java 24+ is installed and in your system PATH
- Try running `java -version` to verify installation

**❌ Port 8080 already in use**
- Another application is using port 8080
- Kill the other process or change the port in `application.properties`

**❌ Application won't start**
- Check that you're in the correct directory (should contain `gradlew` file)
- Make sure you have internet connection (Gradle needs to download dependencies)

**❌ Web page won't load**
- Verify the application started successfully (check console output)
- Make sure you're using the correct URL: http://localhost:8080
- Try refreshing the page or clearing browser cache

### Getting Help
- Check the console output for error messages
- Ensure all prerequisites are properly installed
- Try stopping and restarting the application

## 🛑 Stopping the Application

To stop the application:
- Press `Ctrl + C` in the terminal/command prompt where it's running
- The application will shut down gracefully

**⚠️ Important**: Since this uses an in-memory database, all your scripts will be lost when you stop the application. For permanent storage, consider configuring a file-based database.

## 🚀 Advanced Usage


## 📝 Notes

- This application is perfect for storing code snippets, quick scripts, and reusable code blocks
- The dark theme is easy on the eyes for long coding sessions
- All data is stored in memory and will be lost when the application stops
- The application is lightweight and starts quickly
- No authentication is required - perfect for personal use

---

**Happy Scripting! 🎉** 

If you find this application useful, consider starring the repository and sharing it with fellow developers!
