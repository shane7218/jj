package coreClasses;

import java.util.ArrayList;

public class Shelf implements I_Shelf 
{
	private int numberOfSmallCubbies;
	private int  numberOfMediumCubbies;
	private int numberOfLargeCubbies;
	private int currentNumberOfSmallCubbies;
	private int currentNumberOfMediumCubbies;
	private int currentNumberOfLargeCubbies;
	private ArrayList<Integer> cubbies;
	private int ID;
	private int height;
	private int width;
	private int depth;
	
	protected Shelf()
	{
		this.ID = 0;
		this.height = 0;
		this.width = 0;
		this.depth =  0;
		this.numberOfSmallCubbies = 0;
		this.numberOfMediumCubbies = 0;
		this.numberOfLargeCubbies = 0;
		this.currentNumberOfSmallCubbies  = 0;
		this.currentNumberOfMediumCubbies = 0;
		this.currentNumberOfLargeCubbies  = 0;
		cubbies = new ArrayList<Integer>();
	}
	
	protected Shelf(int id, int height, int width, int depth, int numberOfSmallCubbies, int numberOfMediumCubbies, int numberOfLargeCubbies )
	{
		this.ID = id;
		
		this.height = height;
		this.width = width;
		this.depth = depth;
		
		this.numberOfSmallCubbies = numberOfSmallCubbies;
		this.numberOfMediumCubbies = numberOfMediumCubbies;
		this.numberOfLargeCubbies = numberOfLargeCubbies;
		this.currentNumberOfSmallCubbies  = 0;
		this.currentNumberOfMediumCubbies = 0;
		this.currentNumberOfLargeCubbies  = 0;
		
		cubbies = new ArrayList<Integer>();

	}

	@Override
	public boolean equals(Object obj)
	{
		return (((obj instanceof Shelf)) && ((Shelf) obj) != null && this.ID == ((Shelf) obj).getID());     
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public void setID(int id) {
		this.ID = id;
	}

	@Override
	public void setCubbies(ArrayList<Integer> cubbies) {
		this.cubbies = cubbies;
	}



	@Override
	public boolean hasCubby(int cubbyID) 
	{
		return cubbies.contains(cubbyID);
		
	}

	@Override
	public ArrayList<Integer> getCubbies()
	{
		return cubbies;
	}

	@Override
	public boolean addCubby(I_Cubby cubby) {
		int type  = cubby.getType();
		
		switch(type)
		{
		case 1:
			if(currentNumberOfSmallCubbies < numberOfSmallCubbies)
			{
				cubbies.add(cubby.getID());
				currentNumberOfSmallCubbies++;
				return true;
			}
			break;
		case 2:
			if(currentNumberOfMediumCubbies < numberOfMediumCubbies)
			{
				cubbies.add(cubby.getID());
				currentNumberOfMediumCubbies++;
				return true;
			}
			break;
		case 3:
			if(currentNumberOfLargeCubbies < numberOfLargeCubbies)
			{
				cubbies.add(cubby.getID());
				currentNumberOfLargeCubbies++;
				return true;
			}
			break;
		default:
			break;
		}
		return false;
	}

	@Override
	public boolean removeCubby(I_Cubby cubby) {
		
		int type  = cubby.getType();
		
		if (cubbies.contains(cubby.getID()))
		{
			int positon = cubbies.indexOf(cubby.getID());
			switch(type)
			{
			case 1:
				if(currentNumberOfSmallCubbies > 0)
				{
					cubbies.remove(positon);
					currentNumberOfSmallCubbies--;
					return true;
				}
				break;
			case 2:
				if(currentNumberOfMediumCubbies > 0)
				{
					cubbies.remove(positon);
					currentNumberOfMediumCubbies--;
					return true;
				}
				break;
			case 3:
				if(currentNumberOfLargeCubbies > 0)
				{
					cubbies.remove(positon);
					currentNumberOfLargeCubbies--;
					return true;
				}
				break;
			default:
				break;
			}
		}
		return false;
	}

}
