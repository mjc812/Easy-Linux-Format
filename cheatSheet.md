# ELF Cheat Sheet

A reference sheet for new users to ELF. For a better viewing experience: https://common-pyroraptor-456.notion.site/ELF-Cheat-Sheet-5499fa84b8b5460e991a75b3d6f95dfc

# Object Types

These will be the things that you will be changing with ELF! You can perform actions on a single file and folder or multiple files!

## 📁 Folder

A directory located on your computer where files live

## 📄 🎬 📷  File

 Think — a word document, a picture, a movie, a shell script file, and on and on and on! As long as it can fit in a folder then you’re good!

<aside>
💡 A file or folder is denoted with the **file** or **folder** keyword ahead of the name you give it!

```reason
file fileName ....
folder folderName ...
```

</aside>

# Actions

These are the actions that you want to perform on our (aforementioned) objects! They’re format differs per object — but don’t worry we will show you how to use each of these with both folders and files and their expected format!

### Path

<aside>
💡 Before doing anything in ELF, you need to specify a path to a folder that we can work out of! This folder will be the place where we will grab any files you want to use commands on as well as where we will be putting the altered files once you finish writing commands!

</aside>

**FORMAT:**

```bash
path = get path C://This/is/your/path/;
```

## Assignment:

### Get

Get is our main assignment action — before you perform a command on any object you first have to use the “get” command — so ELF knows what object you’re referring to! 

<aside>
💡 Once you call `get` on an object, you can then begin to use commands on it!

</aside>

**FORMAT:**

```markdown
file yourFileName = **get** file where name is fileName;
folder yourFolder = get folder where name is FolderName;
files filesListName = get all files in yourFolder;
```

```jsx
file yourFile = get file at path this/is/a/path;
folder yourFolder = get folder at path this/is/another/path;
```

### Recursively

Recursively is a special keyword you can place on a `get all files` command that tells us to check every folder within a folder for the file you’re wanting to get. If you don’t use this keyword we will only search the very first level for your file.

```markdown
files listA = get all files **recursively** where name is Brandon Symmers;
```

> Later on we will show you how to advance your get statements to filter for things!
> 

## Assignment Filtering

### By name, modified, or date

**This can be used to specify a general filter based on the properties of the file or folder:**

To filter which files you receive, specify the `where` keyword

`where` is followed by one of:

- `Name`
    - With `name` you must follow with either one of:
        - `is`
        - `contains`
        - `prefix`
        - `suffix`

**FORMAT SUMMARY:**

```reason
file fileA = get file where name **is** Harry Kane;
file fileB = get file where name **contains** Kane;
folder folderA = get folder where name **prefix** Harry Kane;
folder folderB = get folder where name **suffix** Harry Kane;
```

<aside>
💡 The highlighted texts: **(created|modified) (before|on|after)** indicate that any combination of these can be used! Remember that the | symbol is analogous to “or” so when we say created|modified, what we mean is you can choose to put **created or modified** *(just one of them!)* in that part of the statement.

</aside>

### By date

This is used to filter based on date

**`With date`** must be followed by one of:

- `Modified`
    - After you type `modified` you must follow the keyword with:
        - `before`
        - `on`
        - `after`
        
        ```markdown
        files fileA = get all files with date **modified** **before** 2020-03-22;
        files fileA = get all files with date **modified** **on** 2020-03-22;
        files fileA = get all files with date **modified** **after** 2020-03-22;
        ```
        
- Then you end the statement with the date you in which you are filtering on!
- The format is `YYYY-MM-DD`

**FORMAT SUMMARY:**

```reason
files fileA = get all files with date modified (before|on|after) 2020-03-22;
```

## Commands

> To enact these commands on all files within a folder, you can use the **`all`** keyword
> 

### Rename

Use this when you want to change the name of your file!

<aside>
🛑 You cannot use the **all** keyword for the rename command

</aside>

yourFolderName → a folder that you’ve previously called `get` on 

yourFileName → a file that you’ve previously called `get` on 

```markdown
rename yourFileName to newFileName;
rename yourFolderName to newFolderName;
```

### Delete

Use this when you want to delete your files!

```reason
delete yourFileName;
delete yourFolderName;
delete all from yourFolderName;
```

### Copy

Use this when you want to copy your files!

```markdown
copy yourFileName to yourOtherFolderName;
copy yourFolderName to yourOtherFolderName;
copy all from yourFolderName;
```

### Move

Use this when you want to move your files!

```markdown
move yourFileName to yourOtherFolderName;
move yourFolderName to yourOtherFolderName;
move all from yourFolderName;
```

## Command Filtering

We offer statements you can add on to the end of your commands to help you filter which files and folders you want to direct your actions towards!

### IF

This can be used to tell us that you only want to do the specified command if a certain condition is met

**IF** must be followed by one of:

- `name`
    - After you type **name** you must follow it with one of:
        - `contains`
        - `prefix`
        - `suffix`
    - Then input the name you wish to filter based on
    
    ```markdown
    move fileA to folderA if **name is** UBC;
    move fileA to folderA if **name contains** UBC;
    move fileA to folderA if **name prefix** UBC;
    move fileA to folderA if **name suffix** UBC;
    ```
    
- `created`
    - After you type created ****you must follow it with:
        - `by`
    - Then input the name you wish to filter based on
    
    ```markdown
    move fileA to folderA if **created** **by**  Harry Kane;
    ```
    
- `Modified`
    - After you type **modified** you must follow it with:
        - `by` then input the name to filter on
        - `with date` then input the date to filter on
    - Then input the name you wish to filter based on
    
    ```markdown
    move fileA to folderA if **modified** **by** Harry Kane;
    move fileB to folderB if **modified** **with date** before 2022-02-10;
    ```
    
- [With date](https://www.notion.so/ELF-Cheat-Sheet-5499fa84b8b5460e991a75b3d6f95dfc) (see above for specification on how to use it!)

**FORMAT SUMMARY:**

```markdown
move fileA to folderA if name (is|contains|prefix|suffix)? UBC;
move fileA to folderA if (created|modified) by  Harry Kane;
move fileA to folderA if with date modified (before|on|after) 2020-03-22;
```

<aside>
💡 The highlighted texts: **(created|modified) (before|on|after)** indicate that any combination of these can be used! Remember that the | symbol is analogous to “or” so when we say created|modified, what we mean is you can choose to put **created or modified** *(just one of them!)* in that part of the statement.

</aside>

### And

The `and` keyword can be used to specify multiple conditions

```yaml
move fileA to folderA if name contains UBC**,** **and** with date ****modified after 2020-03-22;
```

<aside>
🛑 You cannot have contradictory properties in your AND statements

For example:

```jsx
move fileA to folderA if name contains UBC**,** **and** name contains SFU
```

</aside>
