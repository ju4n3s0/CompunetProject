//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.10
//
// <auto-generated>
//
// Generated from file `App.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

public interface PublisherPrx extends com.zeroc.Ice.ObjectPrx
{
    default int addSubscriber(SubscriberPrx o)
    {
        return addSubscriber(o, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default int addSubscriber(SubscriberPrx o, java.util.Map<String, String> context)
    {
        return _iceI_addSubscriberAsync(o, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Integer> addSubscriberAsync(SubscriberPrx o)
    {
        return _iceI_addSubscriberAsync(o, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Integer> addSubscriberAsync(SubscriberPrx o, java.util.Map<String, String> context)
    {
        return _iceI_addSubscriberAsync(o, context, false);
    }

    /**
     * @hidden
     * @param iceP_o -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Integer> _iceI_addSubscriberAsync(SubscriberPrx iceP_o, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Integer> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "addSubscriber", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeProxy(iceP_o);
                 }, istr -> {
                     int ret;
                     ret = istr.readInt();
                     return ret;
                 });
        return f;
    }

    default int getNumSubs()
    {
        return getNumSubs(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default int getNumSubs(java.util.Map<String, String> context)
    {
        return _iceI_getNumSubsAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Integer> getNumSubsAsync()
    {
        return _iceI_getNumSubsAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Integer> getNumSubsAsync(java.util.Map<String, String> context)
    {
        return _iceI_getNumSubsAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Integer> _iceI_getNumSubsAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Integer> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getNumSubs", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     int ret;
                     ret = istr.readInt();
                     return ret;
                 });
        return f;
    }

    default void removeSubscriber(int id)
    {
        removeSubscriber(id, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void removeSubscriber(int id, java.util.Map<String, String> context)
    {
        _iceI_removeSubscriberAsync(id, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> removeSubscriberAsync(int id)
    {
        return _iceI_removeSubscriberAsync(id, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> removeSubscriberAsync(int id, java.util.Map<String, String> context)
    {
        return _iceI_removeSubscriberAsync(id, context, false);
    }

    /**
     * @hidden
     * @param iceP_id -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_removeSubscriberAsync(int iceP_id, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "removeSubscriber", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeInt(iceP_id);
                 }, null);
        return f;
    }

    default int[] beginSearch(int numWrks, int minN, int maxN)
    {
        return beginSearch(numWrks, minN, maxN, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default int[] beginSearch(int numWrks, int minN, int maxN, java.util.Map<String, String> context)
    {
        return _iceI_beginSearchAsync(numWrks, minN, maxN, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<int[]> beginSearchAsync(int numWrks, int minN, int maxN)
    {
        return _iceI_beginSearchAsync(numWrks, minN, maxN, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<int[]> beginSearchAsync(int numWrks, int minN, int maxN, java.util.Map<String, String> context)
    {
        return _iceI_beginSearchAsync(numWrks, minN, maxN, context, false);
    }

    /**
     * @hidden
     * @param iceP_numWrks -
     * @param iceP_minN -
     * @param iceP_maxN -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<int[]> _iceI_beginSearchAsync(int iceP_numWrks, int iceP_minN, int iceP_maxN, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<int[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "beginSearch", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeInt(iceP_numWrks);
                     ostr.writeInt(iceP_minN);
                     ostr.writeInt(iceP_maxN);
                 }, istr -> {
                     int[] ret;
                     ret = istr.readIntSeq();
                     return ret;
                 });
        return f;
    }

    default void requestPN(int minN, int maxN, ClientCallbackPrx clientCB)
    {
        requestPN(minN, maxN, clientCB, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void requestPN(int minN, int maxN, ClientCallbackPrx clientCB, java.util.Map<String, String> context)
    {
        _iceI_requestPNAsync(minN, maxN, clientCB, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> requestPNAsync(int minN, int maxN, ClientCallbackPrx clientCB)
    {
        return _iceI_requestPNAsync(minN, maxN, clientCB, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> requestPNAsync(int minN, int maxN, ClientCallbackPrx clientCB, java.util.Map<String, String> context)
    {
        return _iceI_requestPNAsync(minN, maxN, clientCB, context, false);
    }

    /**
     * @hidden
     * @param iceP_minN -
     * @param iceP_maxN -
     * @param iceP_clientCB -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_requestPNAsync(int iceP_minN, int iceP_maxN, ClientCallbackPrx iceP_clientCB, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "requestPN", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeInt(iceP_minN);
                     ostr.writeInt(iceP_maxN);
                     ostr.writeProxy(iceP_clientCB);
                 }, null);
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PublisherPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), PublisherPrx.class, _PublisherPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PublisherPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), PublisherPrx.class, _PublisherPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PublisherPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), PublisherPrx.class, _PublisherPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static PublisherPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), PublisherPrx.class, _PublisherPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static PublisherPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, PublisherPrx.class, _PublisherPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static PublisherPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, PublisherPrx.class, _PublisherPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default PublisherPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (PublisherPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default PublisherPrx ice_adapterId(String newAdapterId)
    {
        return (PublisherPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default PublisherPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (PublisherPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default PublisherPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (PublisherPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default PublisherPrx ice_invocationTimeout(int newTimeout)
    {
        return (PublisherPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default PublisherPrx ice_connectionCached(boolean newCache)
    {
        return (PublisherPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default PublisherPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (PublisherPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default PublisherPrx ice_secure(boolean b)
    {
        return (PublisherPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default PublisherPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (PublisherPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default PublisherPrx ice_preferSecure(boolean b)
    {
        return (PublisherPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default PublisherPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (PublisherPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default PublisherPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (PublisherPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default PublisherPrx ice_collocationOptimized(boolean b)
    {
        return (PublisherPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default PublisherPrx ice_twoway()
    {
        return (PublisherPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default PublisherPrx ice_oneway()
    {
        return (PublisherPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default PublisherPrx ice_batchOneway()
    {
        return (PublisherPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default PublisherPrx ice_datagram()
    {
        return (PublisherPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default PublisherPrx ice_batchDatagram()
    {
        return (PublisherPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default PublisherPrx ice_compress(boolean co)
    {
        return (PublisherPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default PublisherPrx ice_timeout(int t)
    {
        return (PublisherPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default PublisherPrx ice_connectionId(String connectionId)
    {
        return (PublisherPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
    default PublisherPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (PublisherPrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::Demo::Publisher";
    }
}
