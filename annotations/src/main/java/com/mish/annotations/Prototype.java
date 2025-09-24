/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2025 Dmitrii Ovchinnikov
 */

package com.mish.annotations;

import java.lang.annotation.*;

/**
 * An annotation to register a prototype instance from a factory method or a class constructor
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface Prototype {

  /**
   * Prototype name
   *
   * @return Prototype name
   */
  String name();

  /**
   * List of all destroyer methods to call before bean destruction
   *
   * @return Destroyer method names
   */
  String[] destroyers() default {""};

  /**
   * List of all initializer method names after bean creation
   *
   * @return Initializer method names
   */
  String[] initializers() default {""};

  /**
   * Order
   *
   * @return Order
   */
  String order() default "";
}
