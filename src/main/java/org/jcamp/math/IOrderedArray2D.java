/*******************************************************************************
* The JCAMP-DX project is the reference implemention of the IUPAC JCAMP-DX spectroscopy data standard.
* 
*   Copyright (C) 2019 Thomas Weber
*
*    This library is free software; you can redistribute it and/or
*    modify it under the terms of the GNU Library General Public
*    License as published by the Free Software Foundation; either
*    version 2 of the License, or (at your option) any later version.
*
*    This library is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
*    Library General Public License for more details.
*
* Contributors:
* Thomas Weber - initial API and implementation
* Christoph Läubrich - implement custom Point2D class
*******************************************************************************/
package org.jcamp.math;

/**
 * real interval with monotone ordered discrete points.
 * allows assignment of a single discrete point/index to a position within the interval. 
 * 
 * @author Thomas Weber
 */
public interface IOrderedArray2D
  extends IArray2D {
  
  /**
   * @return int[]
   * @param x double
   * @param y double
   */
  public int indexAt(double x, double y);
  
  /**
   * get index of point.
   * @return int[]
   * @param p Point2d
   */
  public int indexAt(Point2D p);
}
