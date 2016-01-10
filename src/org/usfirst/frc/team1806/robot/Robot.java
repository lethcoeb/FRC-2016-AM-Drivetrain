
package org.usfirst.frc.team1806.robot;

import org.usfirst.frc.team1806.robot.subsystems.DrivetrainSS;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {

	//Subsystems
	public static DrivetrainSS dtSS;
	
	public static OI oi;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
    	dtSS = new DrivetrainSS();
    	
		oi = new OI();
        // instantiate the command used for the autonomous period
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        //if (autonomousCommand != null) autonomousCommand.cancel();
    }

    public void disabledInit(){

    }
    
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        oi.update();
    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}