package swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

public class DrCanvas extends Canvas {
	private MsPaint__ msPaint__;
	private Image bufferImg;
	private Graphics bufferG;

	public DrCanvas(MsPaint__ msPaint__) {
		this.msPaint__ = msPaint__;
		this.setBackground(new Color(255, 200, 255));

	}

	@Override
	public void update(Graphics g) {
		Dimension d = this.getSize();

		if (bufferG == null) {
			bufferImg = this.createImage(d.width, d.height);
			bufferG = bufferImg.getGraphics();
		}

		// 같은 색깔의 바탕색으로 canvas 채운다
		bufferG.setColor(this.getBackground());
		bufferG.fillRect(0, 0, d.width, d.height);

		// 전에 그려서 ArrayList에 보관한 ShapeDTO에 하나씩 꺼내서 다시 그리기
		legacy(g);
		
		// 새로운 도형 그리기
		// 좌표
		int x1 = Integer.parseInt(msPaint__.getX1T().getText().trim());
		int y1 = Integer.parseInt(msPaint__.getY1T().getText().trim());
		int x2 = Integer.parseInt(msPaint__.getX2T().getText().trim());
		int y2 = Integer.parseInt(msPaint__.getY2T().getText().trim());
		int z1 = Integer.parseInt(msPaint__.getZ1T().getText().trim());
		int z2 = Integer.parseInt(msPaint__.getZ2T().getText().trim());

		// 색
		switch (msPaint__.getCombo().getSelectedIndex()) {
		case 0:
			bufferG.setColor(new Color(255, 0, 0));
			break;
		case 1:
			bufferG.setColor(new Color(200, 91, 1));
			break;
		case 2:
			bufferG.setColor(new Color(255, 255, 0));
			break;
		case 3:
			bufferG.setColor(new Color(0, 255, 0));
			break;
		case 4:
			bufferG.setColor(new Color(0, 0, 255));
			break;
		case 5:
			bufferG.setColor(new Color(24, 2, 176));
			break;
		case 6:
			bufferG.setColor(new Color(255, 0, 255));
			break;

		}

		// 도형
		if (msPaint__.getFill().isSelected()) {
			if (msPaint__.getLine().isSelected())
				bufferG.drawLine(x1, y1, x2, y2);
			else if (msPaint__.getCircle().isSelected()) {
				bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
			} else if (msPaint__.getRect().isSelected()) {
				bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

			} else if (msPaint__.getRoundRect().isSelected()) {
				bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1, z2);
			} else if (msPaint__.getPen().isSelected()) {
				bufferG.drawLine(x1, y1, x2, y2);
			}

		} else {
			if (msPaint__.getLine().isSelected())
				bufferG.drawLine(x1, y1, x2, y2);
			else if (msPaint__.getCircle().isSelected()) {
				bufferG.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
			} else if (msPaint__.getRect().isSelected()) {
				bufferG.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

			} else if (msPaint__.getRoundRect().isSelected()) {
				bufferG.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1, z2);
			}
		}
		
		paint(g);

	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(bufferImg, 0, 0, this);
	}

	private void legacy(Graphics g) {
		// 복원
		for (ShapeDTO dto : msPaint__.getList()) {
			// 좌표

			int x1 = dto.getX1T();
			int y1 = dto.getY1T();
			int x2 = dto.getX2T();
			int y2 = dto.getY2T();
			int z1 = dto.getZ1T();
			int z2 = dto.getZ2T();

			// 색
			switch (dto.getColor()) {
			case 0:
				bufferG.setColor(new Color(255, 0, 0));
				break;
			case 1:
				bufferG.setColor(new Color(200, 91, 1));
				break;
			case 2:
				bufferG.setColor(new Color(255, 255, 0));
				break;
			case 3:
				bufferG.setColor(new Color(0, 255, 0));
				break;
			case 4:
				bufferG.setColor(new Color(0, 0, 255));
				break;
			case 5:
				bufferG.setColor(new Color(24, 2, 176));
				break;
			case 6:
				bufferG.setColor(new Color(255, 0, 255));
				break;
			}

			// 도형
			if (dto.isFill()) {
				if (dto.getShape() == Figure.LINE)
					bufferG.drawLine(x1, y1, x2, y2);
				else if (dto.getShape() == Figure.CIRCLE) {
					bufferG.fillOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (dto.getShape() == Figure.RECT) {
					bufferG.fillRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

				} else if (dto.getShape() == Figure.ROUNDRECT) {
					bufferG.fillRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1, z2);
				} else if (dto.getShape() == Figure.PEN) {
					bufferG.drawLine(x1, y1, x2, y2);
				}

			} else {
				if (dto.getShape() == Figure.LINE)
					bufferG.drawLine(x1, y1, x2, y2);
				else if (dto.getShape() == Figure.CIRCLE) {
					bufferG.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
				} else if (dto.getShape() == Figure.RECT) {
					bufferG.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

				} else if (dto.getShape() == Figure.ROUNDRECT) {
					bufferG.drawRoundRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1), z1, z2);
				}
			}

		}

	}
}
