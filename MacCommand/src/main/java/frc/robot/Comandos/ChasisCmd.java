package frc.robot.Comandos;


import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Subsistemas.ChasisSub;

public class ChasisCmd extends Command{
    
    private final ChasisSub chasisSub;
    private final Supplier<Double> VelFun, GiroFun;

    public ChasisCmd (ChasisSub chasisSub, Supplier<Double> VelFun, Supplier<Double> GiroFun) {
        this.VelFun = VelFun;
        this.GiroFun = GiroFun;
        this.chasisSub = chasisSub;
        addRequirements(chasisSub);

    }

  @Override
  public void initialize () {
    ChasisSub.MotorAgrup();
    
  }

  @Override
  public void execute () {}

  @Override
  public void end (boolean interrupted) {}

  @Override
  public boolean isFinished () {
    return false;
  }
}