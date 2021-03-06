import java.awt.*;
import javax.swing.*;

public class Chequer extends Component {
	// 横向格数
	private Integer verticalnum;
	// 纵向格数
	private Integer horizontalnum;
	// 棋盘长度
	private final Integer height;
	// 棋盘宽度
	private final Integer width;

	public Integer getHorizontalnum() {
		return horizontalnum;
	}

	public void setHorizontalnum(Integer horizontalnum) {
		this.horizontalnum = horizontalnum;
	}

	public Integer getVerticalnum() {
		return verticalnum;
	}

	public void setVerticalnum(Integer verticalnum) {
		this.verticalnum = verticalnum;
	}

	// 初始化棋盘格数
	{
		horizontalnum = 4;
		verticalnum = 4;
		height = width = 300;
	}

	public Chequer() {
		this.setPreferredSize(new Dimension(width, height));
	}

	public Chequer(Integer verticalnum, Integer horizontalnum) {
		this.setVerticalnum(verticalnum);
		this.setHorizontalnum(horizontalnum);
		this.setSize(width, height);
	}

	public void paint(Graphics g) {
		System.out.println("开始画棋盘,长:" + getWidth() + "宽:" + getHeight());
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		// g.drawRect(10, 10, 100, 100);
	}

}
