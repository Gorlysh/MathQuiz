## Requirements

- Home Screen
    >   -   This screen presents three options for addition, subtraction and division.

- Quiz and Quiz Screen
    > - Each quiz consists of 10 questions of the operation type selected through the home screen
    >  - The question is presented in the quiz screen one at a time
    >  - Question presented as a vertical worksheet
    >      -    The two numbers are randomly generated and vertically aligned.
    >      -  The operator must be shown.
    >  -  The number of the current question (e.g., 5 out of the total of 10) must be shown so that the user knows the progress
    >   - Each question must be answered within 5 seconds
    >   - The screen also shows a number pad created by you for the user to pick the results
    >       -   Contains 10 buttons numbered 0-9 respectively, and a button for Enter.
    >       -   The typed digit should be shown below the two vertically aligned numbers (operands).

    > - The current question moves to next question if any of the following happens
    >   -  It’s been five seconds since the start of the question
    >   -  The user has entered the enter key
    >   -   The user has entered the correct answer (e.g., if answer is 3, and the user pressed the key 3, then it automatically moves to next question)
    >   -  Before moving to next question, you must give a visual indication about the correctness of the current answer, without requiring the user to interact with it.
    
- Summary Dialog
    >   -   At the end of the quiz, a dialog needs to be down to summary your total scores, 0-10.
    >   -   The dialog has an OK button, which brings the user back to the home screen.
    
- Ancestral Navigation
    >   -   When doing the quiz, the user must be given the option to press the app icon to get back to the home screen. Before navigating back, prompt the user with a dialog to confirm that he wants to quit the quiz
