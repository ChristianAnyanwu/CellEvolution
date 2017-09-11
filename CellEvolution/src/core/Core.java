package core;

import java.util.ArrayList;
import java.util.Scanner;

import cell.Cell;
import util.StdDraw;

public class Core {

	int canvasWidth = 800;

	int arenaSize = 50;

	ArrayList<Cell> cells = new ArrayList<Cell>();
	Cell[][][] cellGrid = new Cell[50][50][3];

	public static void main(String[] str) {
		System.out.println("Starting");
		Core core = new Core();
		core.Start();

		
	}

	public void Start() {
		setUp();
	}

	public void setUp() {
		System.out.println("Setup");
		createScreen();
		createCells();
		createGrid();

	}

	public void createScreen() {
		StdDraw.setCanvasSize(canvasWidth, canvasWidth);
		StdDraw.setXscale(0, canvasWidth);
		StdDraw.setYscale(0, canvasWidth);
	}

	public void createGrid() {

	}

	public void createCells() {

	}

}
