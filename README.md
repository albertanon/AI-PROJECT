# AI-PROJECT
issafe() method: Checks if it's safe to place a queen at a given position (row, col) on the chessboard by examining vertical, diagonal left-up, and diagonal right-up directions. Returns true if safe, false otherwise.

nQueen() method: Utilizes backtracking to place queens on the board. It starts at the first row and recursively tries to place queens in subsequent rows, exploring each column. If safe, marks the position as a queen ('Q'), proceeds to the next row, and continues. If unsafe, it backtracks and tries the next column.

print() method: Prints the chessboard configuration after placing queens. 'x' represents empty spaces, 'Q' represents queen positions.

main() method: Initializes a 15x15 chessboard with 'x's. Calls nQueen() to start placing queens and prints valid configurations.
