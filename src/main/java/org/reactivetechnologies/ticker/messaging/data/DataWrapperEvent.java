/**
 * Copyright 2017 esutdal

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.reactivetechnologies.ticker.messaging.data;

import com.lmax.disruptor.EventFactory;
/**
 * @deprecated For use in Disruptor
 * @author esutdal
 *
 */
public class DataWrapperEvent {
	public DataWrapperEvent() {
		
	}

	public DataWrapper getEvent() {
		return event;
	}

	public void setEvent(DataWrapper event) {
		this.event = event;
	}

	private DataWrapper event;
	
	public final static EventFactory<DataWrapperEvent> EVENT_FACTORY = new EventFactory<DataWrapperEvent>()
    {
        public DataWrapperEvent newInstance()
        {
            return new DataWrapperEvent();
        }
    };
}