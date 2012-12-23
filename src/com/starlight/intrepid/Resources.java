// Copyright (c) 2010 Rob Eden.
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//     * Redistributions of source code must retain the above copyright
//       notice, this list of conditions and the following disclaimer.
//     * Redistributions in binary form must reproduce the above copyright
//       notice, this list of conditions and the following disclaimer in the
//       documentation and/or other materials provided with the distribution.
//     * Neither the name of Intrepid nor the
//       names of its contributors may be used to endorse or promote products
//       derived from this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
// ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
// WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
// DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
// (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
// LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
// ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
// SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package com.starlight.intrepid;

import com.starlight.locale.ResourceKey;
import com.starlight.locale.ResourceList;
import com.starlight.locale.TextResourceKey;


/**
 *
 */
class Resources extends ResourceList {
	static final ResourceKey<String> INCOMPATIBLE_PROTOCOL_VERSION =
		new TextResourceKey( "Incompatible protocol version. Acceptable range: {0}-{1} " +
		"Requested range: {2}-{3}");

	static final ResourceKey<String> UNKNOWN_MESSAGE_TYPE =
		new TextResourceKey( "Unknown message type: {0}" );

	static final ResourceKey<String> OBJECT_NOT_BOUND =
		new TextResourceKey( "Object not bound: {0}" );

	static final ResourceKey<String> ERROR_USER_REINIT_CONNECTIONS_NOT_ALLOWED =
		new TextResourceKey( "User re-init connections are not allowed by this server." );

	static final ResourceKey<String> ERROR_CLIENT_CONNECTIONS_NOT_ALLOWED_NO_AUTH_HANDLER =
		new TextResourceKey( "Client connections are not allowed (no AuthHandler " +
		"installed)" );
}
