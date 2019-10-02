package editor;

import java.util.ArrayList;
import java.util.List;

import figures.Figure;

public class Drawing {
	private List<Figure> figures;

	public Drawing() {
		this.figures = new ArrayList<Figure>();
	}

	public void add(Figure figure) {
		this.figures.add(figure);
	}

	public void draw() {
		for (Figure figure : figures) {
			figure.draw();
		}
	}
}