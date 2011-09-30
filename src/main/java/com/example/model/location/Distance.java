/*******************************************************************************
 * Copyright (c) 2009-2011 Ansgar Konermann <konermann@itikko.net>
 *
 * This file is part of the Maven 3 Drools Support Package.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package com.example.model.location;

public class Distance {

  private City from;
  private City to;
  private int distance;

  public Distance(City from, City to, int distance) {
    this.from = from;
    this.to = to;
    this.distance = distance;
  }

  public City getFrom() {
    return from;
  }

  public void setFrom(City from) {
    this.from = from;
  }

  public City getTo() {
    return to;
  }

  public void setTo(City to) {
    this.to = to;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }
}
