// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class SetMidRung extends CommandBase {
  /** Creates a new SetMidRung. */
  public SetMidRung() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.climber);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    RobotContainer.climber.setLeftPosition(Constants.ClimberConstants.LEFT_MID);
    RobotContainer.climber.setRightPosition(Constants.ClimberConstants.RIGHT_MID);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.climber.setLeftLiftMotor(0);
    RobotContainer.climber.setRightLiftMotor(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return ((Math.abs(RobotContainer.climber.getLeftError()) < 100) && (Math.abs(RobotContainer.climber.getRightError()) < 100));
  }
}
