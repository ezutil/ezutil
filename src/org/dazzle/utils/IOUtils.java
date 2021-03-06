package org.dazzle.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.log4j.Logger;
import org.dazzle.common.exception.BaseException;

/** @author hcqt@qq.com */
public class IOUtils {

	public static final String msg3Code = "COMMON_IO_UTIL_12446";
	public static final String msg3 = "文件{0}创建失败，详情——{1}";
	public static final String msg5Code = "COMMON_IO_UTIL_OISA8";
	public static final String msg5 = "URI{0}语法错误，无法创建文件，详情——{1}";
	public static final String msg80Code = "SYS_COMMON_COPY_FILE_hj34Q";
	public static final String msg80 = "文件复制失败，详情——{0}";
	public static final String msg79Code = "SYS_COMMON_COPY_FILE_nb23g";
	public static final String msg79 = "无法复制文件到目标位置，目标文件{0}找不到";
	public static final String msg78Code = "SYS_COMMON_COPY_FILE_892hb";
	public static final String msg78 = "无法从指定位置复制文件，源文件{0}找不到";

	private static final Logger LOGGER = Logger.getLogger(IOUtils.class);

	/** @author hcqt@qq.com */
	public static final String readText(String filePath) {
		return RDText.read(filePath, "\r\n", (String) null);
	}

	/** @author hcqt@qq.com */
	public static final String readText(URI filePath) {
		return RDText.read(filePath, "\r\n", (String) null);
	}

	/** @author hcqt@qq.com */
	public static final String readText(URL filePath) {
		return RDText.read(filePath, "\r\n", (String) null);
	}

	/** @author hcqt@qq.com */
	public static final String readText(byte[] inByte) {
		return RDText.read(inByte, "\r\n", (String) null);
	}

	/** @author hcqt@qq.com */
	public static final String readText(InputStream inputStream) {
		return RDText.read(inputStream, "\r\n", (String) null);
	}

	/** @author hcqt@qq.com */
	public static final String readText(File file) {
		return RDText.read(file, "\r\n", (String) null);
	}

	/** @author hcqt@qq.com */
	public static String readText(byte[] inByte, String charsetName) {
		return RDText.read(inByte, "\r\n", charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(String uriStr, String charsetName) {
		return RDText.read(uriStr, "\r\n", charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(URI uri, String charsetName) {
		return RDText.read(uri, "\r\n", charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(URL url, String charsetName) {
		return RDText.read(url, "\r\n", charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(InputStream inputStream, String charsetName) {
		return RDText.read(inputStream, "\r\n", charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(File file, String charsetName) {
		return RDText.read(file, "\r\n", charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(String filePath, String lineEndSeparator, String charsetName) {
		return RDText.read(filePath, lineEndSeparator, charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(URI filePath, String lineEndSeparator, String charsetName) {
		return RDText.read(filePath, lineEndSeparator, charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(URL url, String lineEndSeparator, String charsetName) {
		return RDText.read(url, lineEndSeparator, charsetName);
	}
	
	/** @author hcqt@qq.com */
	public static String readText(byte[] inByte, String lineEndSeparator, String charsetName) {
		return RDText.read(inByte, lineEndSeparator, charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(InputStream inputStream, String lineEndSeparator, String charsetName) {
		return RDText.read(inputStream, lineEndSeparator, charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(File file, String lineEndSeparator, String charsetName) {
		return RDText.read(file, lineEndSeparator, charsetName);
	}

	/** @author hcqt@qq.com */
	public static String readText(byte[] inByte, String charsetName, int rowNum) {
		return RDText.read(inByte, charsetName, rowNum);
	}

	/** @author hcqt@qq.com */
	public static String readText(String uriStr, String charsetName, int rowNum) {
		return RDText.read(uriStr, charsetName, rowNum);
	}

	/** @author hcqt@qq.com */
	public static String readText(URI uri, String charsetName, int rowNum) {
		return RDText.read(uri, charsetName, rowNum);
	}

	/** @author hcqt@qq.com */
	public static String readText(URL url, String charsetName, int rowNum) {
		return RDText.read(url, charsetName, rowNum);
	}

	/** @author hcqt@qq.com */
	public static String readText(InputStream inputStream, String charsetName, int rowNum) {
		return RDText.read(inputStream, charsetName, rowNum);
	}

	/** @author hcqt@qq.com */
	public static String readText(File file, String charsetName, int rowNum) {
		return RDText.read(file, charsetName, rowNum);
	}

	/** @author hcqt@qq.com */
	public static void read(byte[] inByte, String charsetName, ReadLine ReadLine) {
		RDText.read(inByte, charsetName, ReadLine);
	}

	/** @author hcqt@qq.com */
	public static void read(String uriStr, String charsetName, ReadLine ReadLine) {
		RDText.read(uriStr, charsetName, ReadLine);
	}

	/** @author hcqt@qq.com */
	public static void read(URI uri,  String charsetName, ReadLine ReadLine) {
		RDText.read(uri, charsetName, ReadLine);
	}

	/** @author hcqt@qq.com */
	public static void read(URL url, String charsetName, ReadLine ReadLine) {
		RDText.read(url, charsetName, ReadLine);
	}

	/** @author hcqt@qq.com */
	public static void read(InputStream inputStream, String charsetName, ReadLine ReadLine) {
		RDText.read(inputStream, charsetName, ReadLine);
	}

	/** @author hcqt@qq.com */
	public static void read(File file, String charsetName, ReadLine ReadLine) {
		RDText.read(file, charsetName, ReadLine);
	}

	/** @author hcqt@qq.com */
	public static int ReadLineCount(byte[] inByte) {
		return RDText.ReadLineCount(inByte);
	}

	/** @author hcqt@qq.com */
	public static int ReadLineCount(String uriStr) {
		return RDText.ReadLineCount(uriStr);
	}

	/** @author hcqt@qq.com */
	public static int ReadLineCount(URI uri) {
		return RDText.ReadLineCount(uri);
	}

	/** @author hcqt@qq.com */
	public static int ReadLineCount(URL url) {
		return RDText.ReadLineCount(url);
	}

	/** @author hcqt@qq.com */
	public static int ReadLineCount(InputStream inputStream) {
		return RDText.ReadLineCount(inputStream);
	}

	/** @author hcqt@qq.com */
	public static int ReadLineCount(File file) {
		return RDText.ReadLineCount(file);
	}

	////////////
	/** @author hcqt@qq.com */
	public static void write(byte[] inByte, OutputStream outputStream) {
		WR.write(inByte, outputStream);
	}

	/** @author hcqt@qq.com */
	public static void write(InputStream inputStream, OutputStream outputStream) {
		WR.write(inputStream, outputStream);
	}

	/** @author hcqt@qq.com */
	public static void write(String inString, OutputStream outputStream) {
		WR.write(inString, outputStream);
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static void write(byte[] inByte, File dest) {
		WR.write(inByte, CStream.createOutputStream(dest));
	}
	
	/** @author hcqt@qq.com */
	public static void write(InputStream inputStream, File dest) {
		WR.write(inputStream, CStream.createOutputStream(dest));
	}
	
	/** @author hcqt@qq.com */
	public static void write(String inString, File dest) {
		WR.write(inString, CStream.createOutputStream(dest));
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static void write(byte[] inByte, URI dest) {
		WR.write(inByte, CStream.createOutputStream(dest));
	}
	
	/** @author hcqt@qq.com */
	public static void write(InputStream inputStream, URI dest) {
		WR.write(inputStream, CStream.createOutputStream(dest));
	}
	
	/** @author hcqt@qq.com */
	public static void write(String inString, URI dest) {
		WR.write(inString, CStream.createOutputStream(dest));
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static void write(byte[] inByte, URL dest) {
		WR.write(inByte, CStream.createOutputStream(dest));
	}
	
	/** @author hcqt@qq.com */
	public static void write(InputStream inputStream, URL dest) {
		WR.write(inputStream, CStream.createOutputStream(dest));
	}
	
	/** @author hcqt@qq.com */
	public static void write(String inString, URL dest) {
		WR.write(inString, CStream.createOutputStream(dest));
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static void write(byte[] inByte, String dest) {
		WR.write(inByte, CStream.createOutputStream(dest));
	}
	
	/** @author hcqt@qq.com */
	public static void write(InputStream inputStream, String dest) {
		WR.write(inputStream, CStream.createOutputStream(dest));
	}
	
	/** @author hcqt@qq.com */
	public static void write(String inString, String dest) {
		WR.write(inString, CStream.createOutputStream(dest));
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static void write(byte[] inByte, File dest, boolean append) {
		WR.write(inByte, CStream.createOutputStream(dest, append));
	}
	
	/** @author hcqt@qq.com */
	public static void write(InputStream inputStream, File dest, boolean append) {
		WR.write(inputStream, CStream.createOutputStream(dest, append));
	}
	
	/** @author hcqt@qq.com */
	public static void write(String inString, File dest, boolean append) {
		WR.write(inString, CStream.createOutputStream(dest, append));
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static void write(byte[] inByte, URI dest, boolean append) {
		WR.write(inByte, CStream.createOutputStream(dest, append));
	}
	
	/** @author hcqt@qq.com */
	public static void write(InputStream inputStream, URI dest, boolean append) {
		WR.write(inputStream, CStream.createOutputStream(dest, append));
	}
	
	/** @author hcqt@qq.com */
	public static void write(String inString, URI dest, boolean append) {
		WR.write(inString, CStream.createOutputStream(dest, append));
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static void write(byte[] inByte, URL dest, boolean append) {
		WR.write(inByte, CStream.createOutputStream(dest, append));
	}
	
	/** @author hcqt@qq.com */
	public static void write(InputStream inputStream, URL dest, boolean append) {
		WR.write(inputStream, CStream.createOutputStream(dest, append));
	}
	
	/** @author hcqt@qq.com */
	public static void write(String inString, URL dest, boolean append) {
		WR.write(inString, CStream.createOutputStream(dest, append));
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static void write(byte[] inByte, String dest, boolean append) {
		WR.write(inByte, CStream.createOutputStream(dest, append));
	}
	
	/** @author hcqt@qq.com */
	public static void write(InputStream inputStream, String dest, boolean append) {
		WR.write(inputStream, CStream.createOutputStream(dest, append));
	}
	
	/** @author hcqt@qq.com */
	public static void write(String inString, String dest, boolean append) {
		WR.write(inString, CStream.createOutputStream(dest, append));
	}
	////////////
	
	
	////////////
	/** @author hcqt@qq.com */
	public static final long copy(String srcPath, URI dest) {
		return copy(CStream.createInputStream(srcPath), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URI src, URI dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URL src, URI dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(File src, URI dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(byte[] src, URI dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(InputStream input, URI dest) {
		return copy(input, CStream.createOutputStream(dest), null);
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static final long copy(String srcPath, URL dest) {
		return copy(CStream.createInputStream(srcPath), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URI src, URL dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URL src, URL dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(File src, URL dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(byte[] src, URL dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(InputStream input, URL dest) {
		return copy(input, CStream.createOutputStream(dest), null);
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static final long copy(String srcPath, File dest) {
		return copy(CStream.createInputStream(srcPath), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URI src, File dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URL src, File dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(File src, File dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(byte[] src, File dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(InputStream input, File dest) {
		return copy(input, CStream.createOutputStream(dest), null);
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static final long copy(String srcPath, OutputStream dest) {
		return copy(CStream.createInputStream(srcPath), dest, null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URI src, OutputStream dest) {
		return copy(CStream.createInputStream(src), dest, null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URL src, OutputStream dest) {
		return copy(CStream.createInputStream(src), dest, null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(File src, OutputStream dest) {
		return copy(CStream.createInputStream(src), dest, null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(byte[] src, OutputStream dest) {
		return copy(CStream.createInputStream(src), dest, null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(InputStream input, OutputStream dest) {
		return copy(input, dest, null);
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static final long copy(String srcPath, String dest) {
		return copy(CStream.createInputStream(srcPath), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URI src, String dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URL src, String dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(File src, String dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(byte[] src, String dest) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(InputStream input, String dest) {
		return copy(input, CStream.createOutputStream(dest), null);
	}
	////////////
	
	////////////
	/** @author hcqt@qq.com */
	public static final long copy(String srcPath, URI dest, boolean append) {
		return copy(CStream.createInputStream(srcPath), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URI src, URI dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URL src, URI dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(File src, URI dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(byte[] src, URI dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(InputStream input, URI dest, boolean append) {
		return copy(input, CStream.createOutputStream(dest, append), null);
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static final long copy(String srcPath, URL dest, boolean append) {
		return copy(CStream.createInputStream(srcPath), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URI src, URL dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URL src, URL dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(File src, URL dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(byte[] src, URL dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(InputStream input, URL dest, boolean append) {
		return copy(input, CStream.createOutputStream(dest, append), null);
	}
	////////////
	////////////
	/** @author hcqt@qq.com */
	public static final long copy(String srcPath, File dest, boolean append) {
		return copy(CStream.createInputStream(srcPath), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URI src, File dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URL src, File dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(File src, File dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(byte[] src, File dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(InputStream input, File dest, boolean append) {
		return copy(input, CStream.createOutputStream(dest, append), null);
	}
	////////////
	/** @author hcqt@qq.com */
	public static final long copy(String srcPath, String dest, boolean append) {
		return copy(CStream.createInputStream(srcPath), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URI src, String dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(URL src, String dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(File src, String dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(byte[] src, String dest, boolean append) {
		return copy(CStream.createInputStream(src), CStream.createOutputStream(dest, append), null);
	}

	/** @author hcqt@qq.com */
	public static final long copy(InputStream input, String dest, boolean append) {
		return copy(input, CStream.createOutputStream(dest, append), null);
	}
	////////////
	/** @author hcqt@qq.com */
	public static final long copy(InputStream input, OutputStream output, byte[] buffer) {
		try {
			if(input == null) {
				throw new org.dazzle.utils.IOUtils.IOException("SYS_COMMON_COPY_FILE_78H3n", "程序检测到输入流为空，无法进行IO流复制");
			}
			if(output == null) {
				throw new org.dazzle.utils.IOUtils.IOException("SYS_COMMON_COPY_FILE_73LmX", "程序检测到输出流为空，无法进行IO流复制");
			}
			if(buffer == null || buffer.length <= 0) {
				buffer = new byte[63];
			}
			long count = 0L;
			int n = 0;
			try {
				while (-1 != (n = input.read(buffer))) {
					output.write(buffer, 0, n);
//					Arrays.fill(buffer, (byte) 0);
					count += n;
				}
			} catch (java.io.IOException e) {
				throw new org.dazzle.utils.IOUtils.IOException("SYS_COMMON_COPY_FILE_82mPw", "IO流复制发生IO异常，复制失败，详情——{0}", e, e.getMessage());
			}
			return count;
		} finally {
			if(input != null) {
				try { input.close(); } catch (Throwable e) { }
			}
			if(output != null) {
				try { output.close(); } catch (Throwable e) { }
			}
		}
	}

	/**检查文件是否存在，如果不存在则创建 
	 * @author hcqt@qq.com*/
	public static File createFile(File file) {
		try {
			if(!file.exists()) {
				file.createNewFile();
				LOGGER.debug("#####写入文件的绝对路径==>" + file);
			}
		} catch (java.io.IOException e) {
			try {
				createDir(file.getParentFile());
				file.createNewFile();
				LOGGER.debug("#####写入文件的绝对路径==>" + file);
			} catch (java.io.IOException e1) {
				throw new org.dazzle.utils.IOUtils.IOException(msg3Code, msg3, e1, file, ExceptionUtils.out(e1));
			}
		}
		return file;
	}

	/**检查文件是否存在，如果不存在则创建 
	 * @author hcqt@qq.com*/
	public static File createFile(URI uri) {
		return createFile(new File(UU.resolve(uri)));
	}

	/** @author hcqt@qq.com */
	public static File createFile(URL uri) {
		return createFile(new File(UU.resolveToURI(uri)));
	}

	/**检查目录是否存在，如果不存在则创建目录 
	 * @author hcqt@qq.com*/
	public static void createDir(File fileDir) {
		if(!fileDir.exists() && !fileDir.isDirectory()) {
			fileDir.mkdirs();
		}
	}

	/**向文件当中换行后追加内容，
	 * 检查文件是否存在，若不存在则创建文件,
	 * 已由{@link #write(String, File, boolean)}代替
	 * @throws IOException 
	 * @author hcqt@qq.com */
	@Deprecated
	public static void appendContent2File(File file, String content) throws IOException {
		write(content, file, true);
	}

	/**已由{@link #write(String, File)}代替
	 * @author hcqt@qq.com*/
	@Deprecated
	public static void append2File(File file, String content) throws IOException {
		write(content, file, true);
	}

	/** @author hcqt@qq.com */
	private static final class RDText {

		/** @author hcqt@qq.com */
		private static final String read(byte[] inByte, String lineEndSeparator, String charsetName) {
			return read(CStream.createInputStream(inByte), lineEndSeparator, charsetName);
		}

		/** @author hcqt@qq.com */
		private static final String read(String uriStr, String lineEndSeparator, String charsetName) {
			return read(UU.create(uriStr), lineEndSeparator, charsetName);
		}

		/** @author hcqt@qq.com */
		private static final String read(URI uri, String lineEndSeparator, String charsetName) {
			return read(CStream.createInputStream(uri), lineEndSeparator, charsetName);
		}

		/** @author hcqt@qq.com */
		private static final String read(URL url, String lineEndSeparator, String charsetName) {
			return read(CStream.createInputStream(url), lineEndSeparator, charsetName);
		}

		/** @author hcqt@qq.com */
		private static final String read(File file, String lineEndSeparator, String charsetName) {
			return read(CStream.createInputStream(file), lineEndSeparator, charsetName);
		}

		/** @author hcqt@qq.com */
		private static final String read(InputStream inputStream, final String lineEndSeparator, String charsetName) {
			final StringBuilder sb = new StringBuilder();
			final boolean[] flag = new boolean[] { false };
			read(inputStream, charsetName, new ReadLine() {
				@Override
				public boolean read(String rowText, int rowNum) {
					sb.append(rowText);
					if(lineEndSeparator != null) {
						sb.append(lineEndSeparator);
						flag[0] = true;
					}
					return true;
				}
			});
			if(lineEndSeparator != null && flag[0]) {
				int start = sb.length()-lineEndSeparator.length();
				if(start >= 0) {
					sb.delete(start, sb.length());
				}
			}
			return sb.toString();
		}

		/** @author hcqt@qq.com */
		private static final void read(byte[] inStrByte, String charsetName, ReadLine ReadLine) {
			read(CStream.createInputStream(inStrByte), charsetName, ReadLine);
		}

		/** @author hcqt@qq.com */
		private static final void read(String uriStr, String charsetName, ReadLine ReadLine) {
			read(UU.create(uriStr), charsetName, ReadLine);
		}

		/** @author hcqt@qq.com */
		private static final void read(URI uri, String charsetName, ReadLine ReadLine) {
			read(CStream.createInputStream(uri), charsetName, ReadLine);
		}

		/** @author hcqt@qq.com */
		private static final void read(URL url, String charsetName, ReadLine ReadLine) {
			read(CStream.createInputStream(url), charsetName, ReadLine);
		}

		/** @author hcqt@qq.com */
		private static final void read(File file, String charsetName, ReadLine ReadLine) {
			read(CStream.createInputStream(file), charsetName, ReadLine);
		}

		/** @author hcqt@qq.com */
		private static final String read(byte[] inStrByte, String charsetName, int rowNum) {
			return read(CStream.createInputStream(inStrByte), charsetName, rowNum);
		}

		/** @author hcqt@qq.com */
		private static final String read(String uriStr, String charsetName, int rowNum) {
			return read(UU.create(uriStr), charsetName, rowNum);
		}

		/** @author hcqt@qq.com */
		private static final String read(URI uri, String charsetName, int rowNum) {
			return read(CStream.createInputStream(uri), charsetName, rowNum);
		}

		/** @author hcqt@qq.com */
		private static final String read(URL url, String charsetName, int rowNum) {
			return read(CStream.createInputStream(url), charsetName, rowNum);
		}

		/** @author hcqt@qq.com */
		private static final String read(File file, String charsetName, int rowNum) {
			return read(CStream.createInputStream(file), charsetName, rowNum);
		}

		/** @author hcqt@qq.com */
		private static final String read(InputStream inputStream, String charsetName, final int rowNum) {
			final String[] ret = new String[1];
			read(inputStream, charsetName, new ReadLine() {
				@Override
				public boolean read(String rowText, int _rowNum) {
					if(rowNum != _rowNum) {
						return true;
					}
					ret[0] = rowText;
					return false;
				}
			});
			return ret[0];
		}

		/** @author hcqt@qq.com */
		private static final int ReadLineCount(byte[] inStrByte) {
			return ReadLineCount(CStream.createInputStream(inStrByte));
		}

		/** @author hcqt@qq.com */
		private static final int ReadLineCount(String uriStr) {
			return ReadLineCount(UU.create(uriStr));
		}

		/** @author hcqt@qq.com */
		private static final int ReadLineCount(URI uri) {
			return ReadLineCount(CStream.createInputStream(uri));
		}

		/** @author hcqt@qq.com */
		private static final int ReadLineCount(URL url) {
			return ReadLineCount(CStream.createInputStream(url));
		}

		/** @author hcqt@qq.com */
		private static final int ReadLineCount(File file) {
			return ReadLineCount(CStream.createInputStream(file));
		}

		/** @author hcqt@qq.com */
		private static final int ReadLineCount(InputStream inputStream) {
			final Integer[] ret = new Integer[1];
			read(inputStream, Charset.defaultCharset().toString(), new ReadLine() {
				@Override
				public boolean read(String rowText, int rowNum) {
					ret[0] = rowNum;
					return true;
				}
			});
			return ret[0];
		}

		/** @author hcqt@qq.com */
		private static final void read(InputStream inputStream, String charsetName, ReadLine ReadLine) {
			if(inputStream == null) {
				return;
			}
			InputStreamReader inputStreamReader = null;
			BufferedReader bufferedReader = null;
			try {
				charsetName = (null == charsetName ? Charset.defaultCharset().toString() : charsetName);
				try {
					inputStreamReader = new InputStreamReader(inputStream, charsetName);
				} catch (UnsupportedEncodingException e) {
					throw new org.dazzle.utils.IOUtils.IOException("COMMON_READ_FILE_0k65L", "输入流不支持以字符集编码{1}进行读取", e, charsetName);
				}
				bufferedReader = new BufferedReader(inputStreamReader);
				String line = null;
				try {
					for (int i = 1; null != (line = bufferedReader.readLine()); i++) {
						ReadLine.read(line, i);
					}
				} catch (java.io.IOException e) {
					throw new org.dazzle.utils.IOUtils.IOException("COMMON_READ_FILE_ib4V3", "输入流读取失败，详情——{0}", e, e.getMessage());
				}
			} finally {
				if(bufferedReader != null) {
					try { bufferedReader.close(); } catch (java.io.IOException e) { }
				}
				if(inputStreamReader!= null) {
					try { inputStreamReader.close(); } catch (java.io.IOException e) { }
				}
				if(inputStream != null) {
					try { inputStream.close(); } catch (java.io.IOException e) { }
				}
			}
		}
		
	}
	
	/** @author hcqt@qq.com */
	public interface ReadLine {
		/**@return boolean 返回true表示继续下一行，false表示终止逐行读取
		 * @author hcqt@qq.com */
		boolean read(String rowText, int rowNum);
	}

	/** @author hcqt@qq.com */
	private static final class WR {

		/** @author hcqt@qq.com */
		private static void write(byte[] inByte, OutputStream outputStream) {
			write(CStream.createInputStream(inByte), outputStream);
		}

		/** @author hcqt@qq.com */
		private static void write(String inString, OutputStream outputStream) {
			write(CStream.createInputStream(inString.getBytes()), outputStream);
		}

		/** @author hcqt@qq.com */
		private static void write(InputStream inputStream, OutputStream outputStream) {
			copy(inputStream, outputStream);
		}
		
	}

	/** @author hcqt@qq.com */
	static final class CStream {

		/** @author hcqt@qq.com */
		static final InputStream createInputStream(URI inUri) {
			if(inUri == null) {
				throw new org.dazzle.utils.IOUtils.IOException("COMMON_IO_UTIL_9ncds", "创建输入流要求传入方法的java.net.URI实参不能为null");
			}
			return createInputStream(UU.resolveToURL(inUri));
		}

		/** @author hcqt@qq.com */
		static final InputStream createInputStream(URL inUrl) {
			if(inUrl == null) {
				throw new org.dazzle.utils.IOUtils.IOException("COMMON_IO_UTIL_pMFe0", "创建输入流要求传入方法的java.net.URL实参不能为null");
			}
			inUrl = UU.resolve(inUrl);
			try {
				return inUrl.openStream();
			} catch (java.io.IOException e) {
				throw new org.dazzle.utils.IOUtils.IOException("COMMON_IO_UTIL_mghs1", "无法从指定的URL创建输入流，URL路径——{0}", e, inUrl);
			}
		}

		/** @author hcqt@qq.com */
		static final InputStream createInputStream(byte[] inByte) {
			if(inByte == null) {
				throw new org.dazzle.utils.IOUtils.IOException("COMMON_IO_UTIL_6fhzk", "创建输入流要求传入方法的byte[]实参不能为null");
			}
			return new ByteArrayInputStream(inByte);
		}

		/** @author hcqt@qq.com */
		static final InputStream createInputStream(File inFile) {
			if(inFile == null) {
				throw new org.dazzle.utils.IOUtils.IOException("COMMON_IO_UTIL_6jfIe", "创建输入流要求传入方法的java.io.File实参不能为null");
			}
			try {
				return new FileInputStream(inFile);
			} catch (FileNotFoundException e) {
				throw new org.dazzle.utils.IOUtils.IOException("COMMON_IO_UTIL_8g3gP", "无法从不存在的文件创建输入流，详情——{0}", e, e.getMessage());
			}
		}

		/** @author hcqt@qq.com */
		static final InputStream createInputStream(String inPath) {
			return createInputStream(UU.resolve(inPath));
		}

		/** @author hcqt@qq.com */
		static final OutputStream createOutputStream(String outPath) {
			return createOutputStream(outPath, false);
		}

		/** @author hcqt@qq.com */
		static final OutputStream createOutputStream(URI outUri) {
			return createOutputStream(outUri, false);
		}

		/** @author hcqt@qq.com */
		static final OutputStream createOutputStream(URL outUrl) {
			return createOutputStream(outUrl, false);
		}

		/** @author hcqt@qq.com */
		static final OutputStream createOutputStream(File outFile) {
			return createOutputStream(outFile, false);
		}

		/** @author hcqt@qq.com */
		static final OutputStream createOutputStream(String outPath, boolean append) {
			return createOutputStream(new File(UU.resolve(outPath)), append);
		}

		/** @author hcqt@qq.com */
		static final OutputStream createOutputStream(URI outUri, boolean append) {
			return createOutputStream(new File(UU.resolve(outUri)), append);
		}

		/** @author hcqt@qq.com */
		static final OutputStream createOutputStream(URL outUrl, boolean append) {
			return createOutputStream(new File(UU.resolveToURI(outUrl)), append);
		}

		/** @author hcqt@qq.com */
		static final OutputStream createOutputStream(File outFile, boolean append) {
			if(outFile == null) {
				throw new org.dazzle.utils.IOUtils.IOException("COMMON_IO_UTIL_6jf4g", "创建输出流要求传入方法的java.io.File实参不能为null");
			}
			try {
				IOUtils.createFile(outFile);
				return new FileOutputStream(outFile, append);
			} catch (FileNotFoundException e) {
				throw new org.dazzle.utils.IOUtils.IOException("COMMON_IO_UTIL_5hd7D", "无法从不存在的文件创建输出流，详情——{0}", e, ExceptionUtils.out(e));
			}
		}

	}

	/** @author hcqt@qq.com */
	public static class IOException extends BaseException {

		private static final long serialVersionUID = 556038819767707281L;

		/** @author hcqt@qq.com */
		public IOException() {
			super();
		}

		/** @author hcqt@qq.com */
		public IOException(String code, String message, Object... msgArg) {
			super(code, message, msgArg);
		}

		/** @author hcqt@qq.com */
		public IOException(String code, String message, Throwable cause, Object... msgArg) {
			super(code, message, cause, msgArg);
		}

	}

}
