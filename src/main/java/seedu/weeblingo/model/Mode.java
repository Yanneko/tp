package seedu.weeblingo.model;

/**
 * Container for the current mode of WeebLingo.
 */
public class Mode {
    public static final int MODE_MENU = 1;
    public static final int MODE_QUIZ = 2;
    public static final int MODE_LEARN = 3;
    public static final int MODE_QUIZ_SESSION = 4;
    public static final int MODE_CHECK_SUCCESS = 5;
    public static final int MODE_HISTORY = 6;
    public static final int MODE_QUIZ_SESSION_ENDED = 7;

    private int currentMode;

    public Mode() {
        this.currentMode = MODE_MENU;
    }

    /** Switches to quiz mode */
    public void switchModeQuiz() {
        this.currentMode = MODE_QUIZ;
    }

    /** Switches to learn mode */
    public void switchModeLearn() {
        this.currentMode = MODE_LEARN;
    }

    /** Switches to menu mode */
    public void switchModeMenu() {
        this.currentMode = MODE_MENU;
    }

    /** Switches to quiz-session mode */
    public void switchModeQuizSession() {
        this.currentMode = MODE_QUIZ_SESSION;
    }

    /** Switches to answer-check-success mode */
    public void switchModeCheckSuccess() {
        this.currentMode = MODE_CHECK_SUCCESS;
    }

    /** Switches to history mode */
    public void switchModeHistory() {
        this.currentMode = MODE_HISTORY;
    }

    /** Switches to end-of-quiz mode */
    public void switchModeQuizSessionEnded() {
        this.currentMode = MODE_QUIZ_SESSION_ENDED;
    }

    /**
     * Returns the current mode of the app.
     *
     * @return an integer representing current mode of the app
     */
    public int getCurrentMode() {
        int modeCopy = this.currentMode;
        return modeCopy;
    }

    /**
     * Checks if current mode is one of the existing modes
     * @return True if current mode of model is one of the defined modes above
     */
    public boolean isValidMode() {
        return currentMode == MODE_MENU || currentMode == MODE_QUIZ || currentMode == MODE_LEARN
                || currentMode == MODE_QUIZ_SESSION || currentMode == MODE_CHECK_SUCCESS || currentMode == MODE_HISTORY
                || currentMode == MODE_QUIZ_SESSION_ENDED;
    }

}
