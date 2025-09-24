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
 * An imported singleton
 */
@Retention(RetentionPolicy.SOURCE)
@Repeatable(ImportedSingletons.class)
@Target({ElementType.TYPE})
public @interface ImportedSingleton {

  /**
   * A reference to a type
   *
   * @return Reference to a type
   */
  Class<?> ref();

  /**
   * Singleton definition
   *
   * @return Singleton definition
   */
  Singleton def();
}
