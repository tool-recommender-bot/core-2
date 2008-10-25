/*
* JBoss, Home of Professional Open Source
* Copyright 2008, Red Hat Middleware LLC, and individual contributors
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
* http://www.apache.org/licenses/LICENSE-2.0
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,  
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package javax.webbeans;

/**
 * This exception is thrown if an invocation is performed on an inactive scope.
 * 
 * @author Pete Muir
 * @author Shane Bryzak
 */

public class ContextNotActiveException extends ExecutionException
{

   public ContextNotActiveException()
   {
      super();
   }

   public ContextNotActiveException(String message)
   {
      super(message);
   }

   public ContextNotActiveException(Throwable cause)
   {
      super(cause);
   }

   public ContextNotActiveException(String message, Throwable cause)
   {
      super(message, cause);
   }

}
