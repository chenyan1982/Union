/**
 * 棋子类
 * @author 陈彦
 *
 */
import java.awt.Color;
import java.awt.*;

public abstract class Piece {

	private enum PieceColor {
		WHITE, BLACK;
	}

	// 颜色属性*/
	private PieceColor color;
	// 大小属性，棋子半径
	private Integer size;
	// 位置属性
	private Point position;

	// 无参构造器
	public Piece() {

	}

	// 全参构造器
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
