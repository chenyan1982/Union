/**
 * ������
 * @author ����
 *
 */
import java.awt.Color;
import java.awt.*;

public abstract class Piece {

	private enum PieceColor {
		WHITE, BLACK;
	}

	// ��ɫ����*/
	private PieceColor color;
	// ��С���ԣ����Ӱ뾶
	private Integer size;
	// λ������
	private Point position;

	// �޲ι�����
	public Piece() {

	}

	// ȫ�ι�����
	public Piece(PieceColor color, Integer size) {
		this.color = color;
		this.size = size;
	}

	public PieceColor getColor() {
		return color;
	}

	public void setColor(PieceColor color) {
		this.color = color;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point p) {
		this.position = p;
	}

}
