import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacJ extends JFrame implements ActionListener {
    private char[][] board = new char[3][3];
    private JButton[][] buttons = new JButton[3][3];
    private boolean isXTurn = true;

    public TicTacJ() {
        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton(" ");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 60));
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
                board[i][j] = ' ';
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (e.getSource() == buttons[i][j] && board[i][j] == ' ') {
                    board[i][j] = 'X';
                    buttons[i][j].setText("X");
                    isXTurn = false;
                    if (checkWin('X')) {
                        JOptionPane.showMessageDialog(this, "X Wins!");
                        resetBoard();
                        return;
                    }
                    if (isDraw()) {
                        JOptionPane.showMessageDialog(this, "It's a Draw!");
                        resetBoard();
                        return;
                    }
                    aiMove();
                    if (checkWin('O')) {
                        JOptionPane.showMessageDialog(this, "O Wins!");
                        resetBoard();
                    }
                    if (isDraw()) {
                        JOptionPane.showMessageDialog(this, "It's a Draw!");
                        resetBoard();
                    }
                }
            }
        }
    }

    private void aiMove() {
        int[] bestMove = getBestMove();
        board[bestMove[0]][bestMove[1]] = 'O';
        buttons[bestMove[0]][bestMove[1]].setText("O");
        isXTurn = true;
    }

    private int[] getBestMove() {
        int bestScore = Integer.MIN_VALUE;
        int[] bestMove = {-1, -1};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = 'O';
                    int score = minimax(board, false);
                    board[i][j] = ' ';
                    if (score > bestScore) {
                        bestScore = score;
                        bestMove = new int[]{i, j};
                    }
                }
            }
        }
        return bestMove;
    }

    private int minimax(char[][] board, boolean isMaximizing) {
        if (checkWin('O')) return 1;
        if (checkWin('X')) return -1;
        if (isDraw()) return 0;

        int bestScore = isMaximizing ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = isMaximizing ? 'O' : 'X';
                    int score = minimax(board, !isMaximizing);
                    board[i][j] = ' ';
                    bestScore = isMaximizing ? Math.max(score, bestScore) : Math.min(score, bestScore);
                }
            }
        }
        return bestScore;
    }

    private boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
                buttons[i][j].setText(" ");
            }
        }
        isXTurn = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TicTacJ().setVisible(true));
    }
}
