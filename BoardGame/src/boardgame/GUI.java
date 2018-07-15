/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;
import java.util.ArrayList;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Irina
 */
public class GUI extends javax.swing.JFrame {

    Button buttons[][] = new Button[legth][width];
    buttons = { { jButton1, jButton2, jButton3}, {jButton4, jButton5, jButton6}};
    
    //generate board and houses
    for (int i = 0; i < rows; i++){
    

            for (int y = 0; y < cols; y++){
                buttons[i][y] = new Button ();
                Point p = new Point (i*buttonSize, y*buttonSize);
                buttons[i][y].setLocation(p);
                buttons[i][y].setSize(buttonSize, buttonSize);
                
                House h = new House();
                houses[i][y] = h;
            }
    
}
    
    String[] names = new String[size];
    int[] marks = new int[size]; 
    
    House h1 = new House(10000, 1.2);
    House h2 = new House(20000, -9.8);
    board  = {{h1, h2, h3}, {h4, h5, h6}}; //hard wired board
    
    //generate block size dynamically
    
    //generate number of blocks vertically (row wise randome)
    int rows = 3; //three blocks vertically
    for (int i = 0; i < board.legth; i++){ //go through rows
        int columns = Math.random(1,4); // generate # of blocks horizontally 
        
        
        for (int j = 0; j < columns; j++){ //go throuh a block
            
            //go throuhg every house in the block
            for (int m = i; m < rows; m ++) //go though rows in the block
                for (int n = j; n < j)
                    int price = Math.random(10000,50000);
              House h = new House(price, )
        }
    
    String board_string = "";
    for (int i = 0; i< board[0].length ; i++){
        for (int j = 0; j < board.length; j++) {
            if (board[i][j].checkAvailability() == false) {
                board_string += "X";//"house" disabled
            } else {
                board_string += (i + 1) + "," + (j + 1) + " | ";
                 
            }

        }
        board_string += "\n"
    }
    listBoxBoard.set(board_string); //make the list box display the board converted to string

}

int x = txtBoxX.getText();
    int y = txtBoxY.getText();
    //check if house is available
    if (board[x][y].checkAvailability() == true)
        boolean answer = MsgBox("THe price of this house is " +board[x][y].getPrice(). +"Buy?");
        if (aswer == true)
           board[x][y].buy(); //buy the house 
           int price = board[x][y].getPrice();
           players[turn].buy(price); //make the current player pay for the house
           
           
           
    private final CardLayout cardlayout;
    final Container contentPane; //"organizer"

    private String names[];
    private int pos[];
    private int scores[];
    private int numPlayers = 4;
    private int cur_player = 0; //first player in the list goes first my default

    //private final JLabel[] game_board; //this arraywill store our game board later, which we can add once we have actually created components
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setUp();
        //set-up the organization of the frame and content pane
        cardlayout = new CardLayout();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = this.getContentPane();
        contentPane.setLayout(cardlayout);
        contentPane.setPreferredSize(new Dimension(600, 400));
        game.setVisible(false);

        contentPane.add(login, "Panel 1");
        contentPane.add(game, "Panel 2");

        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        game = new javax.swing.JPanel();
        pnlBoard = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRoll = new javax.swing.JButton();
        lblPlayer1 = new javax.swing.JLabel();
        jGameBoard = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        login = new javax.swing.JPanel();
        txtPlayer1 = new javax.swing.JTextField();
        txtPlayer2 = new javax.swing.JTextField();
        cmbPlayers = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        lblPlayer2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel6.setText("jLabel6");

        jLabel5.setText("jLabel5");

        jLabel7.setText("jLabel7");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout pnlBoardLayout = new javax.swing.GroupLayout(pnlBoard);
        pnlBoard.setLayout(pnlBoardLayout);
        pnlBoardLayout.setHorizontalGroup(
            pnlBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBoardLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addGroup(pnlBoardLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        pnlBoardLayout.setVerticalGroup(
            pnlBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnlBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(pnlBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        btnRoll.setText("Roll");
        btnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollActionPerformed(evt);
            }
        });

        lblPlayer1.setText("PlayerName");

        jGameBoard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jGameBoardLayout = new javax.swing.GroupLayout(jGameBoard);
        jGameBoard.setLayout(jGameBoardLayout);
        jGameBoardLayout.setHorizontalGroup(
            jGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
        );
        jGameBoardLayout.setVerticalGroup(
            jGameBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jList4.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        javax.swing.GroupLayout gameLayout = new javax.swing.GroupLayout(game);
        game.setLayout(gameLayout);
        gameLayout.setHorizontalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblPlayer1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(gameLayout.createSequentialGroup()
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(pnlBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnRoll))
                    .addGroup(gameLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jGameBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        gameLayout.setVerticalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jGameBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(pnlBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btnRoll))
                    .addGroup(gameLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addComponent(lblPlayer1)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        getContentPane().add(game, "card2");

        login.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        login.setMaximumSize(new java.awt.Dimension(100, 100));
        login.setPreferredSize(new java.awt.Dimension(200, 200));
        login.setRequestFocusEnabled(false);

        txtPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayer2ActionPerformed(evt);
            }
        });

        cmbPlayers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        cmbPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlayersActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose the # of players:");

        btnStart.setText("Start");
        btnStart.setName(""); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        lblPlayer2.setText("Player Name");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jLabel8.setText("Buy a house");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnStart)
                    .addComponent(txtPlayer1)
                    .addComponent(txtPlayer2))
                .addGap(12, 12, 12)
                .addComponent(lblPlayer2)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmbPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnStart)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(lblPlayer2)
                        .addGap(219, 219, 219))))
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(login, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        //check that entries are not empty
        if ((txtPlayer1.isVisible() && txtPlayer1.getText().equals("")) || (txtPlayer2.isVisible() && txtPlayer1.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Oh-h!.");
        } else {

            //save all the information and change contentpane
            //now can get initialize arrays
            names = new String[numPlayers];
            pos = new int[numPlayers];
            scores = new int[numPlayers];

            //save players names into array and update labels
            if (numPlayers < 2) {

                names[0] = txtPlayer1.getText();
                lblPlayer1.setText(names[0]);

                if (numPlayers < 3) {

                    names[1] = txtPlayer1.getText();
                    lblPlayer2.setText(names[1]);
                }
                //need more code to take care of the other two players
            }

            cardlayout.next(contentPane); //go to next "screen"

        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void cmbPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlayersActionPerformed
        //set everything to invisible first, just in case user is changing their mind
        txtPlayer1.setVisible(false);
        txtPlayer2.setVisible(false);

        numPlayers = Integer.parseInt(cmbPlayers.getSelectedItem().toString()); //have to do a toString conversion, as getSelectedItem returns an Object
        if (numPlayers > 1) {
            txtPlayer2.setVisible(true);

        }
        if (numPlayers > 0) {
            txtPlayer1.setVisible(true);

        }

    }//GEN-LAST:event_cmbPlayersActionPerformed

    private void txtPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlayer2ActionPerformed


    private void btnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollActionPerformed
        //roll virtual dice
        int dice = (int) Math.random() * 6 + 1;
        //move current player
        pos[cur_player] += dice;
        //update player position

    }//GEN-LAST:event_btnRollActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true); //this is the line that creates the main frame and makes it invisible to start with.
            }
        });

    }

    private void setUp() {

        //loging screen
        login.add(txtPlayer1);
        login.add(txtPlayer2);
        login.add(btnStart);
        login.add(cmbPlayers);
        txtPlayer1.setVisible(false);
        txtPlayer2.setVisible(false);

        jGameBoard = new TestPane();
               jGameBoard.setVisible(true);        
        
        game.add(jGameBoard);
        game.validate();
        game.repaint();
        //game screen
        game.add(pnlBoard);
        game.add(btnRoll);
        System.out.println (jGameBoard.getPreferredSize());

        //create random captions on labels
        for (Component c : pnlBoard.getComponents()) {
            if (c instanceof JLabel) { //only want to affect labels, not any other types of things
                //generate a random number
                int num = (int) (Math.random() * 10);
                ((JLabel) c).setText(Integer.toString(num));
            

}
        }

    }

    public class TestPane extends JPanel {

    private int columnCount = 5;
    private int rowCount = 5;
    private java.util.List<Rectangle> cells;
    private Point selectedCell;

    int width = 200;
    int height = 200;

    int cellWidth;
    int cellHeight;

    int xOffset;
    int yOffset;

    public TestPane() {

        this.setPreferredSize(new Dimension(width, height));
        this.setLocation(2, 2);
        cells = new ArrayList<>(columnCount * rowCount);
        MouseAdapter mouseHandler;
        mouseHandler = new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Point point = e.getPoint();

                cellWidth = width / columnCount;
                cellHeight = height / rowCount;

                selectedCell = null;
                if (e.getX() >= xOffset && e.getY() >= yOffset) {

                    int column = (e.getX() - xOffset) / cellWidth;
                    int row = (e.getY() - yOffset) / cellHeight;

                    if (column >= 0 && row >= 0 && column < columnCount && row < rowCount) {

                        selectedCell = new Point(column, row);

                    }

                }
                repaint();

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                Point point = e.getPoint();
                if (point.x < length*buttonSize && point.y < width*buttonSize){
                Button buttonClicked = (Button)e.getSource();

                width = getWidth();
                height = getHeight();

                cellWidth = width / columnCount;
                cellHeight = height / rowCount;

                selectedCell = null;
                if (e.getX() >= xOffset && e.getY() >= yOffset) {

                    int column = (e.getX() - xOffset) / cellWidth;
                    int row = (e.getY() - yOffset) / cellHeight;

                    if (column >= 0 && row >= 0 && column < columnCount && row < rowCount) {

                        selectedCell = new Point(column, row);

                    }

                }
                repaint();

                //display the row clicked
                JOptionPane.showMessageDialog(null, selectedCell.getX());

            }

        };
        //addMouseMotionListener(mouseHandler);
        addMouseListener(mouseHandler); //listens to all mouse clicks and highlights etc.
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    @Override
    public void invalidate() {
        cells.clear();
        selectedCell = null;
        super.invalidate();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        if (cells.isEmpty()) {
            for (int row = 0; row < rowCount; row++) {
                for (int col = 0; col < columnCount; col++) {
                    Rectangle cell = new Rectangle(
                            xOffset + (col * cellWidth),
                            yOffset + (row * cellHeight),
                            cellWidth,
                            cellHeight);
                    cells.add(cell);
                }
            }
        }

        if (selectedCell != null) {

            int index = selectedCell.x + (selectedCell.y * columnCount);
            Rectangle cell = cells.get(index);
            g2d.setColor(Color.BLUE);
            g2d.fill(cell);

        }

        g2d.setColor(Color.GRAY);
        for (Rectangle cell : cells) {
            g2d.draw(cell);
        }

        g2d.dispose();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRoll;
    private javax.swing.JButton btnStart;
    private javax.swing.JComboBox cmbPlayers;
    private javax.swing.JPanel game;
    private javax.swing.JPanel jGameBoard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JPanel login;
    private javax.swing.JPanel pnlBoard;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer2;
    // End of variables declaration//GEN-END:variables
}
