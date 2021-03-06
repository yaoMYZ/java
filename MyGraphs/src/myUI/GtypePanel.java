package myUI;

import java.awt.Frame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import myUI.CircleDlg;
import javax.swing.JToolBar;
import myGraph.*;

public class GtypePanel extends JToolBar {

    /**
     * Creates new form NewBeanForm
     */
    public GtypePanel(Graphs t) {
        this.t = t;
        initComponents();
    }

    public GtypePanel() {
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jComt = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("MouseAdd");
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        add(jToggleButton1);

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText("Circle");
        jToggleButton3.setFocusable(false);
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        add(jToggleButton3);

        buttonGroup1.add(jToggleButton5);
        jToggleButton5.setText("Square");
        jToggleButton5.setFocusable(false);
        jToggleButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        add(jToggleButton5);

        buttonGroup1.add(jToggleButton6);
        jToggleButton6.setText("Triangle");
        jToggleButton6.setFocusable(false);
        jToggleButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        add(jToggleButton6);

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("Line");
        jToggleButton2.setFocusable(false);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        add(jToggleButton2);

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setText("Text");
        jToggleButton4.setFocusable(false);
        jToggleButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        add(jToggleButton4);
        add(jSeparator1);

        jButton1.setText("New&Add");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        add(jSeparator2);

        jComt.setModel(new javax.swing.DefaultComboBoxModel(t.xx));
        jComt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComtActionPerformed(evt);
            }
        });
        add(jComt);

        jButton3.setText("Edit");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);

        jButton2.setText("Delete");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);

        jButton6.setText("Clear");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        add(jSeparator3);

        jButton4.setText("SaveFile");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);

        jButton5.setText("LoadFile");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        contype = 0;
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i = jComt.getSelectedIndex();
        if (i != -1) {
            t.remove(i);
        }
        if (t.gCount() == 0) {
            jComt.setSelectedIndex(-1);
        } else if (i < t.gCount()) {
            jComt.setSelectedIndex(i);
        }
        getParent().repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        contype = 1;
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        switch (contype) {
            case 0:
                MyShape mc=MouseAddJDialog.getCircle((java.awt.Frame) (getRootPane().getParent()));
                if(mc!=null){
                    t.add(mc);
                    jComt.updateUI();
                    getRootPane().getParent().repaint();
                }
                break;
            case 1:
                MyShape c = CircleDlg.getCircle((java.awt.Frame) (getRootPane().getParent()));
                if (c != null) {
                    t.add(c);
                    jComt.updateUI();
                    getRootPane().getParent().repaint();
                }
                break;
            case 2:
                MyShape s = SquareDlg.getSquare((java.awt.Frame) (getRootPane().getParent()));
                if (s != null) {
                    t.add(s);
                    jComt.updateUI();
                    getRootPane().getParent().repaint();
                }
                break;
            case 3:
                MyShape tri = TriangleDlg.getTriangle((java.awt.Frame) (getRootPane().getParent()));
                if (tri != null) {
                    t.add(tri);
                    jComt.updateUI();
                    getRootPane().getParent().repaint();
                }
                break;
            case 4:
                MyShape l = LineDlg.getLine((java.awt.Frame) (getRootPane().getParent()));
                if (l != null) {
                    t.add(l);
                    jComt.updateUI();
                    getRootPane().getParent().repaint();
                }
                break;
            case 5:
                MyShape tx = TextDlg.getText((java.awt.Frame) (getRootPane().getParent()));
                if (tx != null) {
                    t.add(tx);
                    jComt.updateUI();
                    getRootPane().getParent().repaint();
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComtActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        contype = 2;
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        contype = 3;
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        contype = 4;
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        contype = 5;
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int i = jComt.getSelectedIndex();
        if (i != -1) {
            MyShape s = t.xx.get(i);
            if (s instanceof Circle) {
                Circle news = (Circle) CircleDlg.getCircle((Frame) (getRootPane().getParent()), (Circle) s);
                if (news != null) {
                    t.xx.set(i, news);
                }
            }
            if (s instanceof Square) {
                Square news = (Square) SquareDlg.getSquare((Frame) (getRootPane().getParent()), (Square) s);
                if (news != null) {
                    t.xx.set(i, news);
                }
            }
            if (s instanceof Text) {
                Text news = (Text) TextDlg.getText((Frame) (getRootPane().getParent()), (Text) s);
                if (news != null) {
                    t.xx.set(i, news);
                }
            }
            if (s instanceof Line) {
                Line news = (Line) LineDlg.getLine((Frame) (getRootPane().getParent()), (Line) s);
                if (news != null) {
                    t.xx.set(i, news);
                }
            }
            if (s instanceof Triangle) {
                Triangle news = (Triangle) TriangleDlg.getTriangle((Frame) (getRootPane().getParent()), (Triangle) s);
                if (news != null) {
                    t.xx.set(i, news);
                }
            }
        }
        jComt.updateUI();
        getParent().repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed



        // TODO add your handling code here:
        FileIO fio = new FileIO(t);
        try {
            fio.saveFile();
        } catch (IOException ex) {
            Logger.getLogger(GtypePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
//        try {
//            fio.saveToFile();
//        } catch (IOException ex) {
//            Logger.getLogger(GtypePanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        JOptionPane.showMessageDialog(this, "Done successful!");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        FileIO fio = new FileIO(t);
        try {
            t.xx.addAll(fio.loadFile());
        } catch (IOException ex) {
            Logger.getLogger(GtypePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GtypePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComt.updateUI();
//        try {
//            t.xx.addAll(fio.loadToFile());
//        } catch (IOException ex) {
//            Logger.getLogger(GtypePanel.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(GtypePanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
        getParent().repaint();
        JOptionPane.showMessageDialog(this, "Done successful!");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        t.xx.clear();
        getParent().repaint();
    }//GEN-LAST:event_jButton6ActionPerformed

    public Graphs t;
    int contype = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    public javax.swing.JComboBox jComt;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    // End of variables declaration//GEN-END:variables
}
