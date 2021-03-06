/*
 * This file is part of MWtils.
 *
 * Copyright � 2012, Kyle Repinski
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
package mwisbest.mwtils.exception;

public class ConfigurationException extends Exception
{
	private static final long serialVersionUID = 9114809588556690161L;

	public ConfigurationException()
	{
		super();
	}
	
	public ConfigurationException( String message )
	{
		super( message );
	}
	
	public ConfigurationException( String message, Throwable cause )
	{
		super( message, cause );
	}
	
	public ConfigurationException( Throwable cause )
	{
		super( cause );
	}
}