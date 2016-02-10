package cofh.lib.util.position;


public interface IRotateableTile {

	public boolean canRotate();

	public boolean canRotate(ForgeDirection axis);

	public void rotate(ForgeDirection axis);

	public void rotateDirectlyTo(int facing);

	public ForgeDirection getDirectionFacing();

}
