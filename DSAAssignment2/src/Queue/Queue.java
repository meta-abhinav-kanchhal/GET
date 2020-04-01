package Queue;

/*@author Abhinav kanchhal
 * interface of Queue
 * */
interface Queue {
	public abstract void addElement(int data);
	public abstract void deleteElement();
	public abstract boolean isFull();
	public abstract boolean isEmpty();
}
