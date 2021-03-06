package org.usfirst.frc.team5546.robot.commands.winch;

import org.usfirst.frc.team5546.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Lift extends Command {

    public Lift() {
        requires(Robot.winch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	System.out.println("||||||||||||||||||");
//    	System.out.println(Robot.oi.xbox.getRawAxis(3));
    	if(Robot.oi.xbox.getRawAxis(3) > 0.0) {
    		Robot.winch.run(Robot.oi.xbox.getRawAxis(3));
    	}
    	if(Robot.oi.backupWinchClimb.get()) {
    		Robot.winch.run(1);
    	};
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
