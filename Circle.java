/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;


public class Circle {

  private double radius;
  public Circle(double radius)
  {
      if(radius<0)
      {
          this.radius=0;
      }
      else
      {
      this.radius=radius;
      }
  }
  public double getRadius()
  {
      return this.radius;
  }
  public double getArea()
  {
      return radius*radius*Math.PI;
  }
    
}
