/* Copyright [2011] [University of Rostock]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *****************************************************************************/

package org.ws4d.coap.interfaces;

public interface CoapChannelManager {
    // public CoapClientChannel getClientChannel(String remoteHost, int
    // remotePort);
    // public CoapServerChannel getServerChannel(int port);
    public CoapSocketListener createSocketListener(int localPort);

    public int getNewMessageID();

    public void reset();
}