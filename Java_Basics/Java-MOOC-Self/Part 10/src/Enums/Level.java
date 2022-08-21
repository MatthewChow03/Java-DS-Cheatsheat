/**
 *
 * Topics:
 *
 * Use when a value won't change
 *
 * Usually written in a separate file
 *
 * E.g., In Main:
 *       Level level = HIGH;
 *       if (level == Level.HIGH) { do stuff };
 *
 *
 */

package Enums;

public enum Level {
    HIGH  (3),  //calls constructor with value 3
    MEDIUM(2),  //calls constructor with value 2
    LOW   (1)   //calls constructor with value 1
    ; // semicolon needed when fields / methods follow


    private final int levelCode;

    // Constructor of an enum is private
    private Level(int levelCode) {
        this.levelCode = levelCode;
    }
}
