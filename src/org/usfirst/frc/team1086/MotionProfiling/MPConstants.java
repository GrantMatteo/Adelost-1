package org.usfirst.frc.team1086.MotionProfiling;

import org.usfirst.frc.team1086.robot.Globals;

public class MPConstants {
    //This controls turning in the motion profiling. With this excluded, it will still work, but it will be far less accurate
    //P controls how fast it moves towards the target angle
    //Don't use I, but it will give it a boost if it get stuck
    //D controls how quickly it slows down as it approaches the target angle
    public static double TURN_KP = 0.03;
    public static double TURN_KI = 0;
    public static double TURN_KD = Globals.isFinal ? 0.08 : 0.06;

    public static final double DELTA_TIME = 0.02;
    public static final double MAX_VELOCITY = 80;
    public static final double MAX_ACCELERATION = 80.0;
    public static final double MAX_JERK = 363;

    //Controls how aggressively the robot follows the path. Higher will make it jerkier, and lower will be too slow.
    //Note that these constants are dependent on which unit you use!
    public static final double MP_KP = Globals.isFinal ? 0.12 : 0.08;
    public static final double MP_KI = 0;
    public static final double MP_KD = Globals.isFinal ? 0.0 : 0;
    public static final double MP_KV = 1.0 / MAX_VELOCITY;
    public static final double MP_KA = Globals.isFinal ? 0.35 / MAX_ACCELERATION : 0.75 / MAX_ACCELERATION;

    //Experimentally determined... see MotionProfiling.java for more
    public static final double WHEELBASE_WIDTH = Globals.isFinal ? -23.78 : -22.57;
}
