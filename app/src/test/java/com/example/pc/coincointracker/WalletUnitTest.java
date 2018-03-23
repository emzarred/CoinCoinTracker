package com.example.pc.coincointracker;

import com.example.pc.coincointracker.Models.Wallet;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WalletUnitTest {
    @Test
    public void createWallet() throws Exception {
        Wallet wallet = new Wallet(42);
        assertEquals(42, wallet.getBalance(),0.001);
    }

    @Test
    public void depositMoney() throws Exception {
        Wallet wallet = new Wallet(0);
        wallet.deposit(10);
        assertEquals(10, wallet.getBalance(),0.001);
    }


    @Test
    public void withdrawMoney() throws Exception {
        Wallet wallet = new Wallet(20);
        wallet.withdraw(10);
        assertEquals(10, wallet.getBalance(),0.001);
    }
}