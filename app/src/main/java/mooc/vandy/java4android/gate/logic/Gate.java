package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    public Gate() {
        mSwing = CLOSED;
    }

    public boolean setSwing(int direction) {
      boolean set = false;
      if (direction == -1 || direction == 1) {
        mSwing = direction;
        set = true;
      }
      return set;
    }

    public boolean open(int direction) {
      boolean opened = false;
      if (direction == -1 || direction == 1) {
        setSwing(direction);
        opened = true;
      }
      return opened;
    }

    public void close() {
      mSwing = 0;
    }

    public int getSwingDirection() {
      return mSwing;
    }

    public int thru(int count) {
        return (count * getSwingDirection());
    }

    public String toString() {

      if (mSwing == CLOSED) { // a gate that is closed
          return "This gate is closed";
      } else if (mSwing == IN) { // a gate that has opened to swing IN
          return "This gate is open and swings to enter the pen only";
      } else if (mSwing == OUT) { // a gate that been opened swing OUT
          return "This gate is open and swings to exit the pen only";
      } else { // a gate that has a swing value other than IN, OUT, or CLOSED
          return "This gate has an invalid swing direction";
      }
    }
  }
