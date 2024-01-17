// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Comandos.ChasisCmd;
import frc.robot.Subsistemas.ChasisSub;

public class RobotContainer {

  public final static ChasisSub chasisSub = new ChasisSub();
  public Joystick Cntrl = new Joystick(0);

  public RobotContainer() {
    chasisSub.setDefaultCommand(new ChasisCmd(chasisSub, () -> (Cntrl.getRawAxis(5) ), () -> -Cntrl.getRawAxis(0)));

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
