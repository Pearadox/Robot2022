// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {
  private static Climber INSTANCE;

  /** Creates a new Climber. */
  public Climber() {
  }

  public void dashboard() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public static Climber getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Climber();
    }
    return INSTANCE;
  }
}
