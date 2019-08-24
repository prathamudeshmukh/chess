package boardgame.exceptions;

public class OutOfBoardBoundsException extends Exception
{
    public static String INVALID_COORDINATES_COLUMN_INDEX_MESSAGE = "Invalid Coordinates; Column index out of bound";
    public static String INVALID_COORDINATES_ROW_INDEX_MESSAGE = "Invalid Coordinates; Row index out of bound";

    public OutOfBoardBoundsException(String message) {
        super(message);
    }

}
