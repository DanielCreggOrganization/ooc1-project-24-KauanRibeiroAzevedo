[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-

## Resources

# Items Application Manager  
**Name:** Kauan Ribeiro 
**Student ID:** G00431569

## Application Function
This Drink Management System is a Java console application that allows users to manage a collection of drinks. The system provides basic CRUD (Create, Read, Update, Delete) operations through a menu-driven interface. Users can add new drinks with details like serial number, brand name, price and sold status. They can also delete drinks, view all drinks in inventory, and search for specific drinks by ID.

## Running the Application
Prerequisites:
- Java Development Kit (JDK) 17 or higher
- Git (for cloning repository)

Steps to run:
1. Clone the repository
2. Open project in your preferred IDE
3. Navigate to DrinkManagement.java 
4. Run the main() method
5. Follow the menu prompts to:
  - Enter maximum number of drinks to store
  - Select options 1-5 to perform operations
  - Enter drink details when prompted
  - Exit using option 5

## Minimum Project Requirements
- ✅ Regular commits: Project maintained with multiple commits showing steady progress
- ✅ GitHub Repository: All code and documentation properly maintained in GitHub
- ✅ Required Methods:
 - Add Drink: Allows adding new drinks with serial number, brand, price and status
 - Delete Drink: Removes drinks by serial number
 - Show Total: Displays count and details of all drinks 
 - Search: Finds drinks by serial number
 - Quit: Exits application cleanly
- ✅ Code compiles and runs without errors
- ✅ Consistent code formatting and indentation throughout
- ✅ Comprehensive comments for all classes, methods and key variables
- ✅ Documentation reviewed for spelling and grammar

## Project Requirements above and beyond
Enhanced features implemented:
- Dynamic array sizing: Users can specify maximum drinks at runtime
- Input validation: Checks for invalid inputs and array limits
- Error handling: Try-catch blocks to handle exceptions gracefully
- Formatted output: Clean display of drink information
- Clear user interface: Intuitive menu system

## Application Architecture
The application consists of two main classes:

1. Drinks.java
  - Purpose: Defines the Drink object structure
  - Variables:
    - serialNumber (int): Unique identifier
    - brand (String): Drink brand name
    - price (float): Drink price
    - isSold (boolean): Sales status
  - Methods:
    - Constructor: Initializes drink properties
    - Getters/Setters: Access and modify drink properties

2. DrinkManagement.java 
  - Purpose: Main application logic and user interface
  - Key Methods:
    - main(): Application entry point and menu loop
    - displayMenu(): Shows user options
    - addDrink(): Creates new drink records
    - deleteDrink(): Removes drinks by ID
    - showTotalDrinks(): Lists all drinks
    - searchDrinkById(): Finds specific drinks

## Roadblocks and Unfinished Functionality
Challenges faced:
- Limited by static array implementation
- No persistent storage between runs
- Basic console interface

Future improvements:
- Implement dynamic data structure (ArrayList)
- Add database storage
- Create graphical user interface
- Add sorting and filtering capabilities
- Include data export functionality

## Resources
- [Java Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/index.html) - Official Java API documentation
- [W3Schools Java](https://www.w3schools.com/java/) - Java tutorials and examples
- [Stack Overflow](https://stackoverflow.com/) - Problem solving and debugging help
- [GitHub Docs](https://docs.github.com/en) - Git and GitHub guidance
- [Java Code Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html) - Code style guidelines
