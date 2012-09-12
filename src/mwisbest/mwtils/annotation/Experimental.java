/*
 * This file is part of MWtils.
 *
 * Copyright © 2012, Kyle Repinski
 * MWtils is licensed under the GNU Lesser General Public License.
 *
 * MWtils is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MWtils is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package mwisbest.mwtils.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(
	{
		ElementType.ANNOTATION_TYPE,
		ElementType.CONSTRUCTOR,
		ElementType.FIELD,
		ElementType.METHOD,
		ElementType.TYPE
	} )
@Retention( RetentionPolicy.CLASS )
public @interface Experimental
{
	public String author() default "Kyle Repinski";
	public String version() default "1.0";
	public String shortDescription() default "Indicates that the annotated thing is experimental and may be subject to change. It does not mean that the code is buggy, it just indicates that it isn't guaranteed to remain. <i>Applications</i> should be fine using Experimental stuff, <i>Libraries</i> should not.";
	public String value() default "";
}