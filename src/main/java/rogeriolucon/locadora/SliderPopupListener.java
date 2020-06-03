/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.BoundedRangeModel;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author rolucon
 */
public class SliderPopupListener extends MouseAdapter {
  private final JWindow toolTip = new JWindow();
  private final JLabel label = new JLabel("", SwingConstants.CENTER);
  private final Dimension size = new Dimension(60, 20);
  private int prevValue = -1;

  public SliderPopupListener() {
    super();
    label.setOpaque(false);
    label.setBackground(UIManager.getColor("ToolTip.background"));
    label.setBorder(UIManager.getBorder("ToolTip.border"));
    toolTip.add(label);
    toolTip.setSize(size);
  }
  protected void updateToolTip(MouseEvent me) {
    JSlider slider = (JSlider) me.getComponent();
    int intValue = (int) slider.getValue();
    if (prevValue != intValue) {
      label.setText(String.format("%03d Mil", slider.getValue()));
      Point pt = me.getPoint();
      pt.y = -size.height;
      SwingUtilities.convertPointToScreen(pt, me.getComponent());
      pt.translate(-size.width / 2, 0);
      toolTip.setLocation(pt);
    }
    prevValue = intValue;
  }
  @Override public void mouseDragged(MouseEvent me) {
    updateToolTip(me);
  }
  @Override public void mousePressed(MouseEvent me) {
//    if (UIManager.getBoolean("Slider.onlyLeftMouseButtonDrag")
//        && SwingUtilities.isLeftMouseButton(me)) {
//      
//       
//    }
    toolTip.setVisible(true);
    updateToolTip(me);
  }
  @Override public void mouseReleased(MouseEvent me) {
    toolTip.setVisible(false);
  }
  @Override public void mouseWheelMoved(MouseWheelEvent e) {
    JSlider s = (JSlider) e.getComponent();
    int i = (int) s.getValue() - e.getWheelRotation();
    BoundedRangeModel m = s.getModel();
    s.setValue(Math.min(Math.max(i, m.getMinimum()), m.getMaximum()));
  }
}
