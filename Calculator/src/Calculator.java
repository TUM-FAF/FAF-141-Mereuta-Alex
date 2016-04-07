import java.math.*;

public class Calculator extends javax.swing.JFrame {
    
    private boolean zerodisp;
    private boolean decdisp;
    private boolean dgrrad;
    private boolean sh;
    
    private byte op;
    
    private double ina;
    private double inb;
    private double out;

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        display2 = new javax.swing.JTextField();
        display1 = new javax.swing.JTextField();
        pi = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        add = new javax.swing.JButton();
        squared = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        squareroot = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        cuberoot = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        negate = new javax.swing.JButton();
        decpoint = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Calculator");
        setResizable(false);

        display2.setBackground(new java.awt.Color(199, 218, 220));
        display2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        display2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        display2.setFocusable(false);

        display1.setBackground(new java.awt.Color(199, 218, 220));
        display1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        display1.setText("0");
        display1.setAutoscrolls(false);
        display1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        display1.setFocusable(false);

        pi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pi.setText("Pi");
        pi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pi.setFocusCycleRoot(true);
        pi.setFocusable(false);
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        seven.setText("7");
        seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seven.setFocusCycleRoot(true);
        seven.setFocusable(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eight.setText("8");
        eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eight.setFocusCycleRoot(true);
        eight.setFocusable(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nine.setText("9");
        nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nine.setFocusCycleRoot(true);
        nine.setFocusable(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add.setText("+");
        add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusCycleRoot(true);
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        squared.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        squared.setText("x²");
        squared.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squared.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squared.setFocusCycleRoot(true);
        squared.setFocusable(false);
        squared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squaredActionPerformed(evt);
            }
        });

        subtract.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subtract.setText("-");
        subtract.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subtract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtract.setFocusCycleRoot(true);
        subtract.setFocusable(false);
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        squareroot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        squareroot.setText("√x");
        squareroot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squareroot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squareroot.setFocusCycleRoot(true);
        squareroot.setFocusable(false);
        squareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squarerootActionPerformed(evt);
            }
        });

        multiply.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        multiply.setText("*");
        multiply.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multiply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiply.setFocusCycleRoot(true);
        multiply.setFocusable(false);
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        divide.setText("/");
        divide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        divide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divide.setFocusCycleRoot(true);
        divide.setFocusable(false);
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        cuberoot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cuberoot.setText("³√x");
        cuberoot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuberoot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cuberoot.setFocusCycleRoot(true);
        cuberoot.setFocusable(false);
        cuberoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuberootActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        four.setText("4");
        four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        four.setFocusCycleRoot(true);
        four.setFocusable(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        five.setText("5");
        five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        five.setFocusCycleRoot(true);
        five.setFocusable(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        six.setText("6");
        six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        six.setFocusCycleRoot(true);
        six.setFocusable(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        one.setText("1");
        one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        one.setFocusCycleRoot(true);
        one.setFocusable(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        two.setText("2");
        two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        two.setFocusCycleRoot(true);
        two.setFocusable(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        three.setText("3");
        three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        three.setFocusCycleRoot(true);
        three.setFocusable(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        negate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        negate.setText("±");
        negate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        negate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        negate.setFocusCycleRoot(true);
        negate.setFocusable(false);
        negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateActionPerformed(evt);
            }
        });

        decpoint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        decpoint.setText(".");
        decpoint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        decpoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decpoint.setFocusCycleRoot(true);
        decpoint.setFocusable(false);
        decpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpointActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        zero.setText("0");
        zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero.setFocusCycleRoot(true);
        zero.setFocusable(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        equals.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        equals.setText("=");
        equals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equals.setFocusCycleRoot(true);
        equals.setFocusable(false);
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clear.setText("CE");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.setFocusCycleRoot(true);
        clear.setFocusable(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reset.setText("C");
        reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setFocusCycleRoot(true);
        reset.setFocusable(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(display2)
                    .addComponent(display1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(decpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(negate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cuberoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(multiply, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(pi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuberoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(negate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "1");
        zerodisp = true;
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "2");
        zerodisp = true;
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "3");
        zerodisp = true;
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "4");
        zerodisp = true;
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "5");
        zerodisp = true;
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "6");
        zerodisp = true;
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "7");
        zerodisp = true;
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "8");
        zerodisp = true;
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText() + "9");
        zerodisp = true;
    }//GEN-LAST:event_nineActionPerformed

    private void decpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpointActionPerformed
        if(!decdisp){
            display1.setText(display1.getText() + ".");
            decdisp = true;
        }
    }//GEN-LAST:event_decpointActionPerformed

    private void negateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negateActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = inb * -1;
        
        if(out > -100000000 && out < 100000000){
            display1.setText(String.valueOf(out));
        }
        else{
            display1.setText("Error");
        }
        decdisp = true;
        out = 0;
    }//GEN-LAST:event_negateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display1.setText("0");
        zerodisp = false;
        decdisp = false;
    }//GEN-LAST:event_clearActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        display1.setText("0");
        display2.setText(null);
        zerodisp = false;
        decdisp = false;
        ina = 0;
        inb = 0;
        out = 0;
    }//GEN-LAST:event_resetActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        display1.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_piActionPerformed

    private void squaredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squaredActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = inb * inb;
        
        if(out > -100000000 && out < 100000000){
            display1.setText(String.valueOf(out));
        }
        else{
            display1.setText("Error");
        }
        
        display2.setText(String.valueOf(inb) + "²");
        out = 0;
        op = 0;
    }//GEN-LAST:event_squaredActionPerformed

    private void squarerootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squarerootActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = Math.sqrt(inb);

        display1.setText(String.valueOf(out));
        
        display2.setText("√" + String.valueOf(inb));
        out = 0;
        op = 0;
    }//GEN-LAST:event_squarerootActionPerformed

    private void cuberootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuberootActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = Math.cbrt(inb);

        display1.setText(String.valueOf(out));
        
        display2.setText("³√" + String.valueOf(inb));
        out = 0;
        op = 0;
    }//GEN-LAST:event_cuberootActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(op == 0){
            ina = Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb = Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if(op == 1){
            ina = ina + inb;
        }
        
        if(op == 2){
            ina = ina - inb;
        }
        
        if(op == 3){
            ina = ina * inb;
        }
        
        if(op == 4){
            ina = ina / inb;
        }
        
        if(op == 5){
            ina = ina * inb / 100;
        }
        
        display1.setText("0");
        display2.setText(String.valueOf(ina) + " + ");
        
        op = 1;
        
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_addActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        if(op == 0){
            ina = Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb = Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if(op == 1){
            ina = ina + inb;
        }
        
        if(op == 2){
            ina = ina - inb;
        }
        
        if(op == 3){
            ina = ina * inb;
        }
        
        if(op == 4){
            ina = ina / inb;
        }
        
        if(op == 5){
            ina = ina * inb / 100;
        }
        
        display1.setText("0");
        display2.setText(String.valueOf(ina) + " - ");
        
        op = 2;
        
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_subtractActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        if(op == 0){
            ina = Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb = Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if(op == 1){
            ina = ina + inb;
        }
        
        if(op == 2){
            ina = ina - inb;
        }
        
        if(op == 3){
            ina = ina * inb;
        }
        
        if(op == 4){
            ina = ina / inb;
        }
        
        if(op == 5){
            ina = ina * inb / 100;
        }
        
        display1.setText("0");
        display2.setText(String.valueOf(ina) + " * ");
        
        op = 3;
        
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        if(op == 0){
            ina = Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb = Double.parseDouble(String.valueOf(display1.getText()));
        }
        
        if(op == 1){
            ina = ina + inb;
        }
        
        if(op == 2){
            ina = ina - inb;
        }
        
        if(op == 3){
            ina = ina * inb;
        }
        
        if(op == 4){
            ina = ina / inb;
        }
        
        if(op == 5){
            ina = ina * inb / 100;
        }
        
        display1.setText("0");
        display2.setText(String.valueOf(ina) + " / ");
        
        op = 4;
        
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_divideActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        
        if(op == 0){
            out = inb;
            display2.setText(String.valueOf(inb));
        }
        
        if(op == 1){
            out = ina + inb;
            display2.setText(display2.getText() + String.valueOf(inb));
        }
        
        if(op == 2){
            out = ina - inb;
            display2.setText(display2.getText() + String.valueOf(inb));
        }
        
        if(op == 3){
            out = ina * inb;
            display2.setText(display2.getText() + String.valueOf(inb));
        }
        
        if(op == 4){
            out = ina / inb;
            display2.setText(display2.getText() + String.valueOf(inb));
        }
        
        if(op == 5){
            out = ina * inb / 100;
            display2.setText(display2.getText() + String.valueOf(inb) + ")");
        }
        
        if(out > -100000000 && out < 100000000){
            display1.setText(String.valueOf(out));
        }
        else{
            display1.setText("Error");
        }
        
        ina = 0;
        inb = 0;
        out = 0;
        
        op = 0;
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_equalsActionPerformed


    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton cuberoot;
    private javax.swing.JButton decpoint;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton multiply;
    private javax.swing.JButton negate;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton pi;
    private javax.swing.JButton reset;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton squared;
    private javax.swing.JButton squareroot;
    private javax.swing.JButton subtract;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
